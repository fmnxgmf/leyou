package com.leyou.upload.web;

import com.leyou.upload.config.UploadProperties;
import com.leyou.upload.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/31 13:35
 * @version:
 * @modified By:
 */
@RestController
@RequestMapping("upload")
@EnableConfigurationProperties(UploadProperties.class)
public class UploadController {
    @Autowired
    private UploadProperties prop;
    @Autowired
    private UploadService uploadService;
    @PostMapping("image")
    public ResponseEntity<String> uploadImage(@RequestParam("file")MultipartFile file){
        String imageURL = uploadService.uploadImage(file);
        return  ResponseEntity.ok(imageURL);
    }
    @GetMapping("demo")
    public ResponseEntity<String> femo(){

        return  ResponseEntity.ok(prop.getBaseUrl());
    }
}
