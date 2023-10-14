package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import com.google.gson.Gson;

@RestController
@RequestMapping("/api/demo")
public class HomeController {
    @RequestMapping("getDataDemo")
    public String getDataDemo(){
        ArrayList<String> listResult = new ArrayList<>();
        listResult.add("a");
        listResult.add("b");
        listResult.add("c");
        listResult.add("d");
        Gson gson = new Gson();
        String json = gson.toJson(listResult);
        return json;
    }
}
