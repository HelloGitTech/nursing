package com.xjx.nursing.service;

import com.xjx.nursing.pojo.NursingOrder;
import com.xjx.nursing.pojo.NursingOrderDetails;

import java.util.List;

public interface NursingOrderService {
    NursingOrderDetails insertNursingOrder(NursingOrderDetails nursingOrderDetails);
    List<NursingOrder> listNursringOrder(Long sysuserId);
}
