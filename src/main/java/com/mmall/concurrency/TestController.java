package com.mmall.concurrency;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class TestController {

    @RequestMapping("/test")
    //不需要返回页面，ResponseBody
    @ResponseBody
    public String test() {
        return "test--";

    }
}
