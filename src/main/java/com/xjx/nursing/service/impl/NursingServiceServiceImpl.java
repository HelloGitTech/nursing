package com.xjx.nursing.service.impl;

import com.github.pagehelper.PageHelper;
import com.xjx.nursing.mapper.NursingServiceMapper;
import com.xjx.nursing.pojo.NursingService;
import com.xjx.nursing.service.NursingServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingServiceServiceImpl implements NursingServiceService {
    private final NursingServiceMapper nursingServiceMapper;

    public NursingServiceServiceImpl(NursingServiceMapper nursingServiceMapper) {
        this.nursingServiceMapper = nursingServiceMapper;
    }

    @Override
    public NursingService selectById(Long nursingServiceId) {
        return nursingServiceMapper.getNursingService(nursingServiceId);
    }

    @Override
    public List<NursingService> getAllNursingService(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return nursingServiceMapper.getAllNursingService();
    }

    @Override
    public int getTotalCount() {
        return nursingServiceMapper.getTotalCount();
    }

    @Override
    public int update(NursingService nursingService) {
        return nursingServiceMapper.update(nursingService);
    }

    @Override
    public int delete(Long serviceId) {
        return nursingServiceMapper.delete(serviceId);
    }

    @Override
    public int insert(NursingService nursingService) {
        return nursingServiceMapper.insert(nursingService);
    }
}
