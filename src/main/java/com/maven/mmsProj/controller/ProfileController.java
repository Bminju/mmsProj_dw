package com.maven.mmsProj.controller;

import com.maven.mmsProj.model.DwVO;
import com.maven.mmsProj.service.MmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProfileController {

    final
    MmsService mmsService;

    public ProfileController(MmsService mmsService) {
        this.mmsService = mmsService;
    }

    @PostMapping("insertPro")
    public void insertPro(@RequestBody DwVO dw) throws Exception{
        mmsService.insertProfile(dw);
    }
}
