package org.desigin.modules;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    /**
     * 表示从配置文件中获取word
     */
    @Value("${word}")
    private String word;

    @RequestMapping("/test")
    public String test(){
        return "获取的信息：" + word;
    }
}
