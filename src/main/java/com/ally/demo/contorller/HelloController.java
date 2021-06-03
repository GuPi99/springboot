package com.ally.demo.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName :HelloController
 * @ Description:
 * @Author :LiHu
 * @ date:2021/6/3
 * @Version: 1.0
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public  String Hello(){
        return "Hello World";
    }
}
