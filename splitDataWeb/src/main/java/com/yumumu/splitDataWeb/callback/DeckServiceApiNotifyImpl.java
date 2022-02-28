package com.yumumu.splitDataWeb.callback;

import com.alibaba.fastjson.JSONObject;
import com.yumumu.splitDataApi.callback.CommonNotify;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("deckServiceApiNotifyImpl")
public class DeckServiceApiNotifyImpl implements CommonNotify {

    @Override
    public void onReturn(Object result, Object... args) {
        System.out.println("CALLBACK RETURN ARGS: " + JSONObject.toJSONString(args));
        System.out.println("CALLBACK RETURN RESULT: " + JSONObject.toJSONString(result) + " " + new Date());
    }

    @Override
    public void onException(Throwable throwable, Object... args) {
        System.out.println("CALLBACK EXCEPTION" + args);
        throwable.printStackTrace();
    }
}
