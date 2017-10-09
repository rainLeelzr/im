package avatar.rain.im.controller;

import avatar.rain.core.api.Protobuf;
import avatar.rain.im.model.TestInput;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(path = "/hello")
    @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S",
            s2c = "avatar.rain.im.protobuf.IM$SendTextToUserS2C")
    public String hello(@RequestBody TestInput testInput) {
        System.out.println(testInput.toString());
        System.out.println("imServer: allMethod /test/hello");
        return "{\"status\":true}";
    }

    @RequestMapping(value = "/hello/{toUserId}", method = RequestMethod.POST)
    @Protobuf(c2s = "avatar.rain.im.protobuf.IM$SendTextToUserC2S",
            s2c = "avatar.rain.im.protobuf.IM$SendTextToUserS2C")
    public String hello1(@PathVariable("toUserId") Integer toUserId) {

        System.out.println("toUserId:" + toUserId);
        System.out.println("imServer: GET /test/hello1");
        return "imServer: GET /test/hello1";
    }
}
