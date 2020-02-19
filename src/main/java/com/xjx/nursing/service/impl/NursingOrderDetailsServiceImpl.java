package com.xjx.nursing.service.impl;

import com.xjx.nursing.mapper.NursingOrderDetailsMapper;
import com.xjx.nursing.pojo.NursingOrderDetails;
import com.xjx.nursing.service.NursingOrderDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NursingOrderDetailsServiceImpl implements NursingOrderDetailsService {

    private final NursingOrderDetailsMapper nursingOrderDetailsMapper;

    public NursingOrderDetailsServiceImpl(NursingOrderDetailsMapper nursingOrderDetailsMapper){
        this.nursingOrderDetailsMapper = nursingOrderDetailsMapper;
    }

    @Override
    public NursingOrderDetails oneNursingOrderDetails(Long orderId) {
        return nursingOrderDetailsMapper.oneNursingOrderDetails(orderId);
    }

    @Override
    public int getTotalCount(Long sysuserId) {
        return nursingOrderDetailsMapper.getTotalCount(sysuserId);
    }

    @Override
    public List<NursingOrderDetails> listBySysuerId(Long sysuserId,int pageNum, int pageSize) {
        return nursingOrderDetailsMapper.listBySysuerId(sysuserId);
    }

}
