package com.yumumu.splitDataWeb.controller;

import com.alibaba.fastjson.JSONObject;
import com.yumumu.splitDataApi.model.DeckInfoDto;
import com.yumumu.splitDataWeb.model.res.ResponseData;
import com.yumumu.splitDataWeb.model.vo.DeckInfoVo;
import com.yumumu.splitDataWeb.service.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/decks")
public class DeckController {

    @Autowired
    private DeckService deckService;

    @PostMapping("/new")
    public ResponseData<DeckInfoVo> create() {
        try {
            Random random = new Random();
            int type = random.nextInt() % 2 + 1;
            DeckInfoDto deckInfoDto = deckService.createNewDeck(type);
            System.out.println("RETURN: " + (null == deckInfoDto ? "null" : JSONObject.toJSONString(deckInfoDto)) + " " + new Date());
            DeckInfoVo deckInfoVo = new DeckInfoVo();
            deckInfoVo.setUuid("00000000-0000");
            deckInfoVo.setType(type);
            return ResponseData.success(deckInfoVo);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failed(e.getMessage());
        }
    }
}
