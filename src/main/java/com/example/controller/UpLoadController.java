package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

@CrossOrigin
@RestController
public class UpLoadController {


    @RequestMapping("/path")
    public String getPath(){
        try {
            InputStream inputStream = this.getClass().getResourceAsStream("templates/a.txt");
            Reader reader=new InputStreamReader(inputStream);
            char[] b = new char[1024];
            int len = 0;

            len = reader.read(b);

            System.out.println(len);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }

}
