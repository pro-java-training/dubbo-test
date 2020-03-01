package com.codve.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @date 2020/2/26 14:43
 */
public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("app.xml");
        context.start();
        new CountDownLatch(1).await();
    }
}
