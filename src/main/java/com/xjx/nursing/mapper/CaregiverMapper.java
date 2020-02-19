package com.xjx.nursing.mapper;

import com.xjx.nursing.pojo.Caregiver;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaregiverMapper {
    List<Caregiver> getListBySysuserId(Long sysuserId);
    Caregiver selectById(Long caregiverId);
    void insert(Caregiver caregiver);
    void setDefault(@Param("caregiverId") Long caregiverId,@Param("sysuserId") Long sysuserId);
    void deleteById(Long caregiverId);
}
