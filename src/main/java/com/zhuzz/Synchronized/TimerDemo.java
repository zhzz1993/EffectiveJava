package com.zhuzz.Synchronized;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class TimerDemo {
    public static void main(String[] args) {
        //创建定时器对象
        Timer t=new Timer();
        //在3秒后执行MyTask类中的run方法
        t.schedule(new MyTask(), 3000);
        try {
			TimeUnit.SECONDS.sleep(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        t.cancel();
    }
}
