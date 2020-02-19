package com.xjx.nursing.service;

import com.xjx.nursing.pojo.NursingService;

import java.util.List;

public interface NursingServiceService {
    NursingService selectById(Long nursingServiceId);
    List<NursingService> getAllNursingService(int pageNum, int pageSize);
    int getTotalCount();
    int update(NursingService nursingService);
    int delete(Long serviceId);
    int insert(NursingService nursingService);
}
