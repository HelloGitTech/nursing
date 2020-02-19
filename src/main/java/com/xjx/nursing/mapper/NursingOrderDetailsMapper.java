package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.NursingOrderDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NursingOrderDetailsMapper {
    void insertNursingOrderDetails(NursingOrderDetails nursingOrderDetails);
    NursingOrderDetails oneNursingOrderDetails(Long orderId);
    int getTotalCount(Long sysuserId);
    List<NursingOrderDetails> listBySysuerId(Long sysuserId);
}
