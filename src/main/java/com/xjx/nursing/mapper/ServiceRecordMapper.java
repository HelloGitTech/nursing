package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.ServiceRecord;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRecordMapper {
    List<ServiceRecord> listByOrderId(Long orderId);
    int getTotalCountByOrderId(Long orderId);
    void update(ServiceRecord serviceRecord);
    void insert(ServiceRecord serviceRecord);
}
