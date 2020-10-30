package com.example.demogit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;

@RestController
public class TestCmd {

    @GetMapping("/hello")
    public String hello(){
        return "Hi";
    }

    public static void main(String[] args) {
        String path = "C:\\project\\demo-git";
        try {
            Process p = Runtime.getRuntime().exec("cmd /c git log --oneline");
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            String tmp="";
            while((line = br.readLine()) != null){
                tmp = tmp+line;
                System.out.println(line);
            }
            System.out.println(tmp);
            FileWriter fw = new FileWriter(tmp);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}