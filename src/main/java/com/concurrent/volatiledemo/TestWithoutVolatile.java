package com.concurrent.volatiledemo;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019/1/7 10:49
 */
public class TestWithoutVolatile {
    private static boolean bChanged;

    public static void main(String[] args) throws InterruptedException {
        new Thread() {
            @Override
            public void run() {
                for (; ; ) {
                    if (bChanged == true) {
                        System.out.println("!=");
                        System.exit(0);
                    }
                }
            }
        }.start();
        Thread.sleep(1000);
        new Thread() {
            @Override
            public void run() {
                for (; ; ) {
                    bChanged = true;
                }
            }
        }.start();
    }

}