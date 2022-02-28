package com.yumumu.splitDataWeb.service;

import com.yumumu.splitDataApi.model.DeckInfoDto;
import com.yumumu.splitDataApi.service.AsyncDeckApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeckService {

    /**
     *  当前版本dubbo（2.7.8）@Method注解有问题。
     *  https://github.com/apache/dubbo/issues/6833
     *  https://github.com/apache/dubbo/pull/7741
     */
//    @MyReference(methods = {@Method(name = "createNewDeck", async = true, onreturn = "deckServiceApiNotifyImpl.onReturn", onthrow = "deckServiceApiNotifyImpl.onException")})
//    @MyReference(methods = {@Method(name = "createNewDeck", async = true, onreturn = "notifyImpl.onreturn", onthrow = "notifyImpl.onthrow")})
//    @DubboReference(methods = {@Method(name = "createNewDeck", async = true, oninvoke = "notifyImpl.oninvoke", onreturn = "notifyImpl.onreturn", onthrow = "notifyImpl.onthrow")})
    @Resource
    private AsyncDeckApi asyncDeckApi;

    public DeckInfoDto createNewDeck(Integer type) {
        DeckInfoDto newDeck = asyncDeckApi.createNewDeck(type);
        return newDeck;
    }
}
