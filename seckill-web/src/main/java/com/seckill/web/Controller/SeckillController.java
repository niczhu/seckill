package com.seckill.web.Controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillController {

    private Logger logger= Logger.getLogger(SeckillController.class);

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        logger.info("seckill controller test ...");
        logger.debug("seckill controller debug ...");
        return "test response..";
    }
}
