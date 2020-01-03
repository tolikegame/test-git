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
        String str= "返回一個新字串，它是此字串的一個子字串。該子字串從指定的 beginIndex 處開始， endIndex:到指定的 endIndex-1處結束。"
                ;

        return "Hello";
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
