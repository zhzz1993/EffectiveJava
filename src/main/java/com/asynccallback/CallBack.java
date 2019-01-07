package com.asynccallback;

/**
 * @description: 回调接口
 * @author zhuzz
 * @data: 2017-11-29 上午9:40:42
 */
public interface CallBack {

    /**
     * 这个是小李知道答案时要调用的函数告诉小王，也就是回调函数
     *
     * @param result 答案
     */
    void solve(String result);
}
