package com.seckill.web.Controller;

import com.seckill.api.SeckillService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

import java.util.HashMap;

@Controller
public class SeckillController {

//    @Autowired
//    private SeckillService seckillService;

    private Logger logger= Logger.getLogger(SeckillController.class);


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Object test(){
        logger.info("seckill controller test ...");
        SeckillService seckillService = (SeckillService) ContextLoader.getCurrentWebApplicationContext().getBean("seckillServiceReference");
        seckillService.search(new HashMap<String,Object>());

        return "test response..";
    }
}
