package com.cloudinary.dragonball.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @Author: gengjihui
 * @Date: 2024/5/15 16:43
 * @Description:
 */
public class ImageExchangeUtils {
  public static void main(String[] args) throws IOException {
    getImage();
  }

  public static void getImage() throws IOException {
    // 加载图片
    BufferedImage image = ImageIO.read(new File("/Users/gengjihui/DragonBall/src/main/resources/images/dragonBall.png"));

    // 设置字符画的分辨率和字符集
    int width = 80;
    int height = 60;
    String charSet = "@#8?*!:.";

    // 创建字符画
    StringBuilder sb = new StringBuilder();
    for (int y = 0; y < height; y++) {
      for (int x = 0; x < width; x++) {
        // 获取当前像素的 RGB 值
        int pixel = image.getRGB(x * (image.getWidth() / width), y * (image.getHeight() / height));
        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = pixel & 0xff;
        // 计算灰度值
        int gray = (red + green + blue) / 3;
        // 将灰度值映射到字符集中
        char c = charSet.charAt(gray * (charSet.length() - 1) / 255);
        sb.append(c);
      }
      sb.append("\n");
    }

    System.out.println(sb.toString());
  }


}
