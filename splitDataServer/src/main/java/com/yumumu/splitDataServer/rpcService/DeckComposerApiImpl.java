package com.yumumu.splitDataServer.rpcService;

import com.yumumu.splitDataApi.model.DeckComposerDto;
import com.yumumu.splitDataApi.model.DeckDto;
import com.yumumu.splitDataApi.service.DeckComposerApi;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcException;

import java.util.UUID;

@DubboService
public class DeckComposerApiImpl implements DeckComposerApi {



    @Override
    public String createOneDeckComposer(DeckComposerDto deckComposerDto) {

        return UUID.randomUUID().toString();
    }

    @Override
    public DeckDto getDeckContent(String uuid) {
        DeckDto deckDto = new DeckDto();
        deckDto.setUuid(uuid);
        deckDto.setId(1L);
        deckDto.setSlideId(1L);
        deckDto.setContent("123456");
        if ("000".equals(uuid)) {
            throw new RpcException("WRONG UUID");
        }
        return deckDto;
    }

    @Override
    public DeckComposerDto getDeckComposerByDeckUuid(String uuid) {
        DeckComposerDto deckComposerDto = new DeckComposerDto();
        deckComposerDto.setStructure("abcdef");
        return deckComposerDto;
    }
}
