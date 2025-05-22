package org.koreait.file.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/file")
public class FileController {
    @GetMapping("/upload")
    public String upload() {

        return "file/upload";
    }

    @PostMapping("/upload")
    public void uploadPs(@RequestPart("attach") MultipartFile file) {
        File uploadFile = new File("C:/uploads/" + file.getOriginalFilename());
        try {
            file.transferTo(uploadFile);
        } catch (IOException e) {}
    }
}
