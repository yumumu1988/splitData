package com.yumumu.splitDataWeb.model.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeckVo implements Serializable {
    private static final long serialVersionUID = -4458695395150461572L;

    private String uuid;
    private String content;
    private Long id;
    private Long slideId;
}
