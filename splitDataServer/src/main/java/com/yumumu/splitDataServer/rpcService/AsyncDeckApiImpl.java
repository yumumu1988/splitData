package com.yumumu.splitDataServer.rpcService;

import com.yumumu.splitDataApi.model.DeckInfoDto;
import com.yumumu.splitDataApi.service.AsyncDeckApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.AsyncContext;
import org.apache.dubbo.rpc.RpcContext;

import java.util.Date;
import java.util.UUID;

@DubboService
public class AsyncDeckApiImpl implements AsyncDeckApi {
    @Override
    public DeckInfoDto createNewDeck(Integer type) {
        System.out.println("createNewDeck START " + new Date());
        AsyncContext asyncContext = RpcContext.startAsync();

        DeckInfoDto deckInfoDto = new DeckInfoDto();

        new Thread(()->{
            deckInfoDto.setUuid(UUID.randomUUID().toString());
            deckInfoDto.setType(type);
            System.out.println("ASYNC START " + new Date());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            asyncContext.write(deckInfoDto);
            System.out.println("ASYNC END " + new Date());
        }).start();
        System.out.println("CREATE ONE DECK: " + deckInfoDto.getUuid());
        System.out.println("createNewDeck END " + new Date());
        return deckInfoDto;
    }
}
