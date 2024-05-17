package com.cloudinary.dragonball.controller;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @Author: gengjihui
 * @Date: 2024/5/16 16:55
 * @Description:
 */
@RequestMapping("/file")
@RestController
public class FileHandelController {

  @GetMapping("/download")
  public ResponseEntity<InputStreamResource> downloadFile() {
    // 创建文件内容，这里使用字符串作为例子
    String content = "Hello, this is the file content!";
    InputStream inputStream = new ByteArrayInputStream(content.getBytes());

    // 创建InputStreamResource包装InputStream
    InputStreamResource resource = new InputStreamResource(inputStream);

    return ResponseEntity.ok()
      .contentType(MediaType.APPLICATION_OCTET_STREAM)
      .header("Content-Disposition", "attachment; filename=\"example.txt\"")
      .body(resource);
  }
}
