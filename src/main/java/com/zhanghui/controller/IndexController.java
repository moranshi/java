package com.zhanghui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhanghui on 2017/12/5.
 */
@Controller
@RequestMapping(value="/")
public class IndexController {

    @RequestMapping("index")
    public String get(){
        return "/index";
    }

}
