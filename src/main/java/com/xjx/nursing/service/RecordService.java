package com.xjx.nursing.service;

import com.xjx.nursing.pojo.ServiceRecord;

import java.util.List;

public interface RecordService {
   int getTotalCountByOrderId(Long orderId);
   List<ServiceRecord> listByOrderId(Long orderId,int pageNum, int pageSize);
   void update(ServiceRecord serviceRecord);
   void insert(ServiceRecord serviceRecord);
}
