package com.yumumu.splitDataWeb.interfaces;

import com.yumumu.splitDataApi.model.DeckInfoDto;

public interface Notify {
    /**
     *  处理响应
     * @param deckInfoDto 结果
     * @param type 请求参入
     */
    void onreturn(DeckInfoDto deckInfoDto, Integer type);

    /**
     *  处理异常
     * @param throwable 异常
     * @param args 请求参数
     */
    void onthrow(Throwable throwable, Integer args);

    void oninvoke(Integer type);
}
