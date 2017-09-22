package avatar.rain.im.controller;

import avatar.rain.core.net.tcp.request.Protobuf;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(path = "/hello")
    @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S")
    public String hello() {
        System.out.println("imServer: /test/hello");
        return "imServer: /test/hello";
    }

    @RequestMapping(value = "/hello1")
    @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S")
    public String hello1() {
        System.out.println("imServer: /test/hello");
        return "imServer: /test/hello";
    }
}
