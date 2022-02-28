package com.yumumu.splitDataServer.rpcService;

import com.yumumu.splitDataApi.service.TestApi;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TestApiImpl implements TestApi {

    @Override
    public void test(String test) {
        System.out.println(test);
    }
}
