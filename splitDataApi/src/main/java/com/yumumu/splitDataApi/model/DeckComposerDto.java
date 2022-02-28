package com.yumumu.splitDataApi.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeckComposerDto implements Serializable {
    private static final long serialVersionUID = 2574744939575817248L;

    private Integer id;
    private Integer axxId;
    private String structure;
    private Long deckId;
    private Long slideId;
}
