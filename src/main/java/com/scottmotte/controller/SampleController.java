package com.scottmotte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

  @RequestMapping("/")
  public String loadHomePage(Model m) {
    m.addAttribute("message", "Hello World! - From Abdul 2");
    return "index";
  }
}

