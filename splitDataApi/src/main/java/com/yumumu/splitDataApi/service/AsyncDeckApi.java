package com.yumumu.splitDataApi.service;

import com.yumumu.splitDataApi.model.DeckInfoDto;

/**
 *  Dubbo异步创建课件接口
 */
public interface AsyncDeckApi {

    /**
     *  根据设置的类型创建课件
     * @param type 课件类型
     * @return 课件信息
     */
    DeckInfoDto createNewDeck(Integer type);

}
