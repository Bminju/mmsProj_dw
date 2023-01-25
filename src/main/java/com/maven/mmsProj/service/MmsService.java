package com.maven.mmsProj.service;

import com.maven.mmsProj.model.TechVO;

import java.util.List;
import java.util.Map;

public interface MmsService {

    public List<TechVO> techSelect(String genName) throws Exception;

    public Map<String,String> infoSelect(String genName) throws Exception;
}
