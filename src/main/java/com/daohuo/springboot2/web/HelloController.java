package com.daohuo.springboot2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：jgl.
 * @ Date       ：Created in 10:22 2019/2/21
 * @ Description：
 * @ Modified By：
 * @Version: 1.0$
 */
@Controller
public class HelloController {

    @RequestMapping(value="/hello")
    public String hello(){

        return "error/403";
    }

}
