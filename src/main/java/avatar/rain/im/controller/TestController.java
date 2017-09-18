package avatar.rain.im.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("imServer: /test/hello");
        return "imServer: /test/hello";
    }
}
