package com.spi;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-03-08 15:38
 */
public class RedService implements DubboService {
    @Override
    public void sayHello() {

        System.out.println("我是RedService服务实现");

    }
}
