package com.yumumu.splitDataWeb.service;

import com.yumumu.splitDataApi.model.DeckComposerDto;
import com.yumumu.splitDataApi.model.DeckDto;
import com.yumumu.splitDataApi.service.DeckComposerApi;
import com.yumumu.splitDataWeb.model.vo.DeckComposerVo;
import com.yumumu.splitDataWeb.model.vo.DeckVo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class DeckComposerService {

    /**
     * 则只有是RpcException时才会进入mock中。
     * org.apache.dubbo.rpc.support.MockInvoker#getMockObject(java.lang.String, java.lang.Class)
     * org.apache.dubbo.rpc.cluster.support.wrapper.MockClusterInvoker#invoke(org.apache.dubbo.rpc.Invocation)
     * mock指定为force:表示一定执行mock
     */
    @DubboReference(stub = "com.yumumu.splitDataApi.service.DeckComposerApiStub",
//            mock = "force:com.yumumu.splitDataApi.service.DeckComposerApiMock")
            mock = "com.yumumu.splitDataApi.service.DeckComposerApiMock")
    private DeckComposerApi deckComposerApi;

    public DeckComposerVo createNewDeckComposer(DeckComposerVo deckComposerVo) {
        DeckComposerDto deckComposerDto = new DeckComposerDto();
        BeanUtils.copyProperties(deckComposerVo, deckComposerDto);
        String uuid = deckComposerApi.createOneDeckComposer(deckComposerDto);
        deckComposerVo.setUuid(uuid);
        return deckComposerVo;
    }

    public DeckVo loadDeckComposerContent(String uuid) {
        DeckDto deckDto = deckComposerApi.getDeckContent(uuid);
        DeckVo deckVo = new DeckVo();
        BeanUtils.copyProperties(deckDto, deckVo);
        return deckVo;
    }

    public DeckComposerVo loadDeckComposerStructure(String uuid) {
        DeckComposerDto deckComposerDto = deckComposerApi.getDeckComposerByDeckUuid(uuid);
        DeckComposerVo deckComposerVo = new DeckComposerVo();
        BeanUtils.copyProperties(deckComposerDto, deckComposerVo);
        return deckComposerVo;
    }
}
