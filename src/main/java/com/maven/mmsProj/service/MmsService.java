package com.maven.mmsProj.service;

import com.maven.mmsProj.model.DwVO;
import com.maven.mmsProj.model.TechVO;

import java.util.List;
import java.util.Map;

public interface MmsService {

    public void insertProfile(DwVO dw) throws Exception;

    public void insertFact(DwVO dw) throws Exception;

    public List<DwVO> selectProfile(DwVO dw) throws Exception;

    public List<DwVO> selectFact(String bidId) throws Exception;

}
