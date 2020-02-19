package com.xjx.nursing.service;

import com.xjx.nursing.pojo.NursingOrderDetails;

import java.util.List;

public interface NursingOrderDetailsService {
    NursingOrderDetails oneNursingOrderDetails(Long orderId);
    int getTotalCount(Long sysuserId);
    List<NursingOrderDetails> listBySysuerId(Long sysuserId,int pageNum, int pageSize);
}
