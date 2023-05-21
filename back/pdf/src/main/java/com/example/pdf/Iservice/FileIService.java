package com.example.pdf.Iservice;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileIService {
    List<String> uploadFiles(List<MultipartFile> multipartFiles) throws IOException;
    ResponseEntity<Resource> downloadFile(String filename) throws IOException;
}
