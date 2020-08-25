package xin.jiuzhiqian.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhou
 */
@RestController
public class HelloController {
    @GetMapping("/hello2")
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format("Hello2 %s!", name);
    }
}