package avatar.rain.im.controller;

import avatar.rain.core.api.Protobuf;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(path = "/hello")
    // @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S")
    public String hello(Integer toUserId) {
        System.out.println("toUserId:" + toUserId);
        System.out.println("imServer: allMethod /test/hello");
        return "imServer: allMethod /test/hello";
    }

    @RequestMapping(value = "/hello/{toUserId}", method = RequestMethod.GET)
    @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S")
    public String hello1(@PathVariable("toUserId") Integer toUserId) {
        System.out.println("toUserId:" + toUserId);
        System.out.println("imServer: GET /test/hello1");
        return "imServer: GET /test/hello1";
    }
}
