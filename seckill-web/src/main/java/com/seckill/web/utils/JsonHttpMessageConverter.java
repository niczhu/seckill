package com.seckill.web.utils;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class JsonHttpMessageConverter extends FastJsonHttpMessageConverter4 implements InitializingBean {
    Log logger = LogFactory.getLog("com.seckill.web");

    public JsonHttpMessageConverter() {
    }

    public void afterPropertiesSet() throws Exception {
        this.addConfig(this.getFastJsonConfig());
    }

    protected void addConfig(FastJsonConfig fastJsonConfig) {
    }

    protected void writeInternal(Object obj, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        Map<String, Object> map = new HashMap();
        map.put("code", 0);
        map.put("msg", "success");
        map.put("data", obj);
        super.writeInternal(map, type, outputMessage);
    }
}
