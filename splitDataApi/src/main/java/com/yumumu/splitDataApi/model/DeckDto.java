package com.yumumu.splitDataApi.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeckDto implements Serializable {
    private static final long serialVersionUID = 1578311744790113818L;

    private Long id;
    private String uuid;
    private String content;
    private Long slideId;
}
