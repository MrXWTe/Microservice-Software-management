package com.gz.softwaremanagement.controller;

import com.gz.softwaremanagement.entities.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 客户端访问服务接口
 * @Author: MrXu
 * @date: 2019/7/10
 */
@RestController
public class ControllerConsumer {

    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:9001";

    @RequestMapping("/consumer/get")
    public Admin get(){
        Map<String, Object> map = new HashMap<>();
        map.put("admin_email", "luoguoquan@gz.com");
        map.put("admin_password", "123456");
        return restTemplate.getForObject(REST_URL_PREFIX + "/adminLogin?admin_email={admin_email}" +
                        "&admin_password={admin_password}", Admin.class, map);
    }

}
