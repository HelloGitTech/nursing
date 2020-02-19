package com.xjx.nursing.service;

import com.xjx.nursing.pojo.Caregiver;

import java.util.List;

public interface CaregiverService {
    List<Caregiver> getListBySysuserId(Long sysuserId);
    Caregiver selectById(Long caregiverId);
    void insert(Caregiver caregiver);
    void setDefault(Long caregiverId,Long sysuserId);
    void deleteById(Long caregiverId);
}
