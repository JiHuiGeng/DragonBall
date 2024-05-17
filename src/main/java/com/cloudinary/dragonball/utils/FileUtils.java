package com.cloudinary.dragonball.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: gengjihui
 * @Date: 2024/5/16 16:52
 * @Description:
 */
public class FileUtils {

  public static void main(String[] args) throws IOException {
    // 创建文件
    Path path = Paths.get("example.txt");
    Files.createFile(path);

    // 写入内容
    String content = "This is some text.";
    Files.write(path, content.getBytes());
  }

}
