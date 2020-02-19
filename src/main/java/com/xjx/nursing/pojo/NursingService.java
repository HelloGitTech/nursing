package com.xjx.nursing.pojo;

import com.xjx.nursing.enumeration.ServiceTypeEnum;

public class NursingService {
    private Long serviceId;
    private String serviceName;
    private ServiceTypeEnum serviceType;
    private String serviceDesc;
    private int serviceNumber;
    private Long servicePrice;
    private int validity;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ServiceTypeEnum getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceTypeEnum serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getValidity() {
        return validity;
    }

    public void setValidity(int validity) {
        this.validity = validity;
    }

    @Override
    public String toString() {
        return "NursingService{" +
                "serviceId=" + serviceId +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType=" + serviceType +
                ", serviceDesc='" + serviceDesc + '\'' +
                ", serviceNumber=" + serviceNumber +
                ", servicePrice=" + servicePrice +
                ", validity=" + validity +
                '}';
    }
}
