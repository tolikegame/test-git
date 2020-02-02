package com.example.demogit;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(value = "/aa")
@RestController
public class TestGitMaster {

    @GetMapping("/tt")
    public String tt(){
        return "tt";
    }

    @GetMapping(value = "/aa")
    public String test(){
        System.out.println("gdfklgdflkgoioj");
        System.out.println("fdgfffffffffffffffdddg");
        System.out.println("sssssssssssssss");
        System.out.println("qqqqqqqqqqqqqqqqqq");
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        List<String> list2 = Lists.newLinkedList();
        list2.add("ccc");
        list2.add("ddd");
        System.out.println(this.getStringAdd(list));
        System.out.println(this.getStringAdd(list2));
        StringBuilder sb = new StringBuilder();
        sb.append(this.getStringAdd(list));
        sb.append(this.getStringAdd(list2));
        return String.valueOf(sb);

    }

    private String getStringAdd(List<String> list) {
        return Joiner.on(" > ").join(list);
    }

}
