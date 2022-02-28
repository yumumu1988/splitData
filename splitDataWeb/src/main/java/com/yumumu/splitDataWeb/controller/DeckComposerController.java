package com.yumumu.splitDataWeb.controller;

import com.yumumu.splitDataWeb.model.res.ResponseData;
import com.yumumu.splitDataWeb.model.vo.DeckComposerVo;
import com.yumumu.splitDataWeb.model.vo.DeckVo;
import com.yumumu.splitDataWeb.service.DeckComposerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deckComposer")
public class DeckComposerController {

    @Autowired
    private DeckComposerService deckComposerService;

    @PostMapping("/new")
    public ResponseData<DeckComposerVo> create(@RequestBody DeckComposerVo deckComposerVo) {
        try {
            return ResponseData.success(deckComposerService.createNewDeckComposer(deckComposerVo));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failed(e.getMessage());
        }
    }

    @GetMapping("/{uuid}/content")
    public ResponseData<DeckVo> load(@PathVariable("uuid") String uuid) {
        try {
            return ResponseData.success(deckComposerService.loadDeckComposerContent(uuid));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failed(e.getMessage());
        }
    }

    @GetMapping("/{uuid}/structure")
    public ResponseData<DeckComposerVo> loadStructure(@PathVariable("uuid") String uuid) {
        try {
            return ResponseData.success(deckComposerService.loadDeckComposerStructure(uuid));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseData.failed(e.getMessage());
        }
    }
}
