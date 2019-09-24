package com.seckill.dal;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:seckill-dal-config.xml")
@ComponentScan("com.seckill.dal")
public class Config {
}
