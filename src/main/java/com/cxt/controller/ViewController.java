package com.cxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面视图发送请求接受
 *
 */
@Controller
public class ViewController {
    @GetMapping(value = {"credit/index",""})
    public String indexPage(){
        return  "credit/index";
    }

}
