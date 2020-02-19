package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.NursingOrder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NursingOrderMapper {
    int insertNursingOrder(NursingOrder nursingOrder);
    List<NursingOrder> listNursringOrder(Long sysuserId);
}
