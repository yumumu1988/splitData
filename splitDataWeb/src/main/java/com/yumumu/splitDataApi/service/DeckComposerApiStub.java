package com.yumumu.splitDataApi.service;

import com.yumumu.splitDataApi.model.DeckComposerDto;
import com.yumumu.splitDataApi.model.DeckDto;
import org.springframework.stereotype.Service;

public class DeckComposerApiStub implements DeckComposerApi {

    private final DeckComposerApi deckComposerApi;

    public DeckComposerApiStub(DeckComposerApi deckComposerApi) {
        this.deckComposerApi = deckComposerApi;
    }

    @Override
    public String createOneDeckComposer(DeckComposerDto deckComposerDto) {
        return null;
    }

    @Override
    public DeckDto getDeckContent(String uuid) {
        System.out.println("BEFORE getDeckContent");
        DeckDto deckContent = deckComposerApi.getDeckContent(uuid);
        System.out.println("AFTER getDeckContent");
        return deckContent;
    }

    @Override
    public DeckComposerDto getDeckComposerByDeckUuid(String uuid) {
        return null;
    }
}
