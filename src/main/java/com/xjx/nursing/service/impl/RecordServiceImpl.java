package com.xjx.nursing.service.impl;

import com.github.pagehelper.PageHelper;
import com.xjx.nursing.mapper.ServiceRecordMapper;
import com.xjx.nursing.pojo.ServiceRecord;
import com.xjx.nursing.service.RecordService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    private final ServiceRecordMapper serviceRecordMapper;

    public RecordServiceImpl(ServiceRecordMapper serviceRecordMapper){
        this.serviceRecordMapper = serviceRecordMapper;
    }

    @Override
    public int getTotalCountByOrderId(Long orderId) {
        return serviceRecordMapper.getTotalCountByOrderId(orderId);
    }

    @Override
    public List<ServiceRecord> listByOrderId(Long orderId,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return serviceRecordMapper.listByOrderId(orderId);
    }

    @Override
    public void update(ServiceRecord serviceRecord) {
        serviceRecordMapper.update(serviceRecord);
    }

    @Override
    public void insert(ServiceRecord serviceRecord) {
        serviceRecordMapper.insert(serviceRecord);
    }
}
