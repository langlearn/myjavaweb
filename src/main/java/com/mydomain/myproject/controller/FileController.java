package com.mydomain.myproject.controller;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Yang on 2014/6/16.
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @RequestMapping("download")
    public ResponseEntity<byte[]> downloadFile() throws IOException {
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", "dict.txt");
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(File.createTempFile("temp",".txt"))
                ,headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "upload",method = RequestMethod.POST)
    @ResponseBody
    public Map upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (!file.isEmpty()) {
            System.out.println(file.getName());
            System.out.println(file.getContentType());
            System.out.println(file.getBytes());
            return ImmutableMap.of("success", true);
        }else {
            return ImmutableMap.of("success", false,"msg", "请选择一个文件");
        }
    }
}
