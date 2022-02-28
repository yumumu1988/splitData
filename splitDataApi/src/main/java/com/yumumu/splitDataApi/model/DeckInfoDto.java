package com.yumumu.splitDataApi.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeckInfoDto implements Serializable {
    private static final long serialVersionUID = 7819102526120179573L;

    public static final Integer TYPE_DECK = 1;
    public static final Integer TYPE_COUSEWARE = 2;

    private String uuid;
    private Integer type;
}
