package com.yumumu.splitDataApi.callback;

/**
 *  Dubbo异步调用回调处理通知接口
 */
public interface CommonNotify {

    /**
     *  处理响应
     * @param result 结果
     * @param args 请求参入
     */
    void onReturn(Object result, Object... args);

    /**
     *  处理异常
     * @param throwable 异常
     * @param args 请求参数
     */
    void onException(Throwable throwable, Object... args);
}
