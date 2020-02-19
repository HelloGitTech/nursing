package com.xjx.nursing.vo;

import com.xjx.nursing.pojo.NursingService;

public class NursingServiceVO extends NursingService{
    private int serviceTypeCode;

    public int getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(int serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }
}
