package com.DesignPattern.Bridge;

public class MyBridge extends Bridge {  
    public void method(){  
        getSource().method();  
    }  
}
