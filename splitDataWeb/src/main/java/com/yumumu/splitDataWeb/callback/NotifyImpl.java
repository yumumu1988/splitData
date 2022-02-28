package com.yumumu.splitDataWeb.callback;

import com.alibaba.fastjson.JSONObject;
import com.yumumu.splitDataApi.model.DeckInfoDto;
import com.yumumu.splitDataWeb.interfaces.Notify;
import org.springframework.stereotype.Service;

@Service("notifyImpl")
public class NotifyImpl implements Notify {
    @Override
    public void onreturn(DeckInfoDto deckInfoDto, Integer type) {
        System.out.println(JSONObject.toJSONString(deckInfoDto));
    }

    @Override
    public void onthrow(Throwable throwable, Integer args) {
        throwable.printStackTrace();
    }

    @Override
    public void oninvoke(Integer type) {
        System.out.println("ON INVOKE");
    }
}
