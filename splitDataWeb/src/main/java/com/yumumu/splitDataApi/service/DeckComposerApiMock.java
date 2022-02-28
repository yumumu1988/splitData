package com.yumumu.splitDataApi.service;

import com.yumumu.splitDataApi.model.DeckComposerDto;
import com.yumumu.splitDataApi.model.DeckDto;

public class DeckComposerApiMock implements DeckComposerApi {

    @Override
    public String createOneDeckComposer(DeckComposerDto deckComposerDto) {
        return null;
    }

    @Override
    public DeckDto getDeckContent(String uuid) {
        DeckDto deckDto = new DeckDto();
        deckDto.setId(-1L);
        deckDto.setSlideId(-1L);
        deckDto.setContent("-1");
        deckDto.setUuid("-1");
        System.out.println("RETURN MOCK");
        return deckDto;
    }

    @Override
    public DeckComposerDto getDeckComposerByDeckUuid(String uuid) {
        return null;
    }
}
