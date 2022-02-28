package com.yumumu.splitDataApi.service;

import com.yumumu.splitDataApi.model.DeckComposerDto;
import com.yumumu.splitDataApi.model.DeckDto;

/**
 *  讲次课件相关接口
 */
public interface DeckComposerApi {

    /**
     *  创建一个讲次课件
     */
    String createOneDeckComposer(DeckComposerDto deckComposerDto);

    /**
     *  获取讲次课件内容
     */
    DeckDto getDeckContent(String uuid);

    /**
     *  获取讲次结构
     */
    DeckComposerDto getDeckComposerByDeckUuid(String uuid);

}
