package com.xjx.nursing.service.impl;

import com.xjx.nursing.mapper.CaregiverMapper;
import com.xjx.nursing.pojo.Caregiver;
import com.xjx.nursing.service.CaregiverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaregiverServiceImpl implements CaregiverService {
    private final CaregiverMapper caregiverMapper;
    public CaregiverServiceImpl(CaregiverMapper caregiverMapper) {
        this.caregiverMapper = caregiverMapper;
    }

    @Override
    public List<Caregiver> getListBySysuserId(Long sysuserId) {
        return caregiverMapper.getListBySysuserId(sysuserId);
    }

    @Override
    public Caregiver selectById(Long caregiverId) {
        return caregiverMapper.selectById(caregiverId);
    }

    @Override
    public void insert(Caregiver caregiver) {
        caregiverMapper.insert(caregiver);
    }

    @Override
    public void setDefault(Long caregiverId, Long sysuserId) {
        caregiverMapper.setDefault(caregiverId,sysuserId);
    }

    @Override
    public void deleteById(Long caregiverId) {
        caregiverMapper.deleteById(caregiverId);
    }
}
