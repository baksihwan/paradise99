package com.sihwanprogram1.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
  @GetMapping("/home/main")
  @ResponseBody
  public String index() {
    return "index";
  }
}