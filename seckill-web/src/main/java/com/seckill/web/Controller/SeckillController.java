package com.seckill.web.Controller;

import com.seckill.api.SeckillService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillController {


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        return "test response..";
    }
}
