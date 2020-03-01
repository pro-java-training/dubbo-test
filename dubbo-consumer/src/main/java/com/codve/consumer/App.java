package com.codve.consumer;

import com.codve.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author admin
 * @date 2020/2/26 14:48
 */
public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app.xml");
        HelloService helloService = context.getBean("helloService", HelloService.class);
        logger.warn(helloService.hello("James"));
    }
}
