package com.example.demogit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

@RestController
public class Test {

    @GetMapping("/a")
    public String a(){
        return "Hello";
    }

    @GetMapping("/git")
    public String git(){
        return "test";
    }

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process p = null;
        String path = "C:\\project\\demo-git";
        try {
            p = rt.exec("cmd /c dir cd "+path+" git log --oneline");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
    }
}
