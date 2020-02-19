package com.xjx.nursing.pojo;

import com.xjx.nursing.enumeration.ServicePlaceEnum;
import com.xjx.nursing.enumeration.SexEnum;

public class Caregiver {
    private Long caregiverId;
    private String caregiverName;
    private SexEnum sex;
    private int caregiverAge;
    private String serviceCity;
    private String serviceDistrict;
    private ServicePlaceEnum servicePlace;
    private String caregiverAddress;
    private String contactPerson;
    private String contactPhone;
    private int isDefault;
    private Long sysuserId;

    public Long getCaregiverId() {
        return caregiverId;
    }

    public void setCaregiverId(Long caregiverId) {
        this.caregiverId = caregiverId;
    }

    public String getCaregiverName() {
        return caregiverName;
    }

    public void setCaregiverName(String caregiverName) {
        this.caregiverName = caregiverName;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public int getCaregiverAge() {
        return caregiverAge;
    }

    public void setCaregiverAge(int caregiverAge) {
        this.caregiverAge = caregiverAge;
    }

    public String getServiceCity() {
        return serviceCity;
    }

    public void setServiceCity(String serviceCity) {
        this.serviceCity = serviceCity;
    }

    public String getServiceDistrict() {
        return serviceDistrict;
    }

    public void setServiceDistrict(String serviceDistrict) {
        this.serviceDistrict = serviceDistrict;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Long getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(Long sysuserId) {
        this.sysuserId = sysuserId;
    }

    public ServicePlaceEnum getServicePlace() {
        return servicePlace;
    }

    public void setServicePlace(ServicePlaceEnum servicePlace) {
        this.servicePlace = servicePlace;
    }

    public String getCaregiverAddress() {
        return caregiverAddress;
    }

    public void setCaregiverAddress(String caregiverAddress) {
        this.caregiverAddress = caregiverAddress;
    }

    public int getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(int isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "Caregiver{" +
                "caregiverId=" + caregiverId +
                ", caregiverName='" + caregiverName + '\'' +
                ", sex=" + sex +
                ", caregiverAge=" + caregiverAge +
                ", serviceCity='" + serviceCity + '\'' +
                ", serviceDistrict='" + serviceDistrict + '\'' +
                ", servicePlace=" + servicePlace +
                ", caregiverAddress='" + caregiverAddress + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", isDefault=" + isDefault +
                ", sysuserId=" + sysuserId +
                '}';
    }
}
