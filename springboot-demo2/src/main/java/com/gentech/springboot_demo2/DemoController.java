package com.gentech.springboot_demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/demo")
public class DemoController {

    @GetMapping("/msg")
    public String getMessage()
    {
        // http://localhost:9091/v1/demo/msg
        return "WELCOME!!";
    }
}
