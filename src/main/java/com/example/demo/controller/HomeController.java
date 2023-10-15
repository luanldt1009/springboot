package com.example.demo.controller;

import com.example.demo.model.notifyline.RequestNotifyLine;
import com.example.demo.model.notifyline.ResponseNotifyLine;
import com.example.demo.utils.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/demo")
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;
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
    private final String apiUrl = "https://notify-api.line.me/api/notify";
    private final String tokenNotify= "0vUWYVUXaMkNmabhtSKjfMmxor3Xn6x1WNFX4jRR2AI";
    @RequestMapping("sendNotifyLine")
    public ResponseNotifyLine sendNotifyLine(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.setBearerAuth(tokenNotify);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("message", "value1");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(body, headers);
        ResponseNotifyLine responseNotifyLine = restTemplate.postForObject(apiUrl, requestEntity, ResponseNotifyLine.class);
        return responseNotifyLine;
    }
}
