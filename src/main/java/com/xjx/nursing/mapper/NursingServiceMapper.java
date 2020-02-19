package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.NursingService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NursingServiceMapper {
    NursingService getNursingService(Long nursingServiceId);
    List<NursingService> getAllNursingService();
    int getTotalCount();
    int update(NursingService nursingService);
    int delete(Long serviceId);
    int insert(NursingService nursingService);
}
