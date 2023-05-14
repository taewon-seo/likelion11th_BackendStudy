package com.backendstudy.homework1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Homework1Controller {
    @GetMapping("/MyPage")
    public String getMyPage() {

        return "MyPage"; // 출력할 페이지 이름

    }
}