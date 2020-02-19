package com.xjx.nursing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjx.nursing.enumeration.OrderStatusEnum;

import java.util.Date;

public class NursingOrderDetails {
    private Long orderDetailsId;
    private Long orderId;
    private String orderCode;

    private String serviceName;
    private int serviceType;
    private String serviceDesc;
    private Long servicePrice;
    private int serviceNumber;

    private Long orderAmount;
    private int productQuantity;
    private Long payAmount;
    private Long paidAmount;

    private String orderCaregiverName;
    private int orderCaregiverAge;
    private int orderCaregiverSex;
    private String orderCaregiverAddr;

    private String serviceCity;
    private String serviceDistrict;
    private String contactPerson;
    private String contactPhone;

    private String serviceStartTime;
    private int servicePlace;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private OrderStatusEnum orderStatus;
    private Long sysuserId;

    public Long getOrderDetailsId() {
        return orderDetailsId;
    }

    public void setOrderDetailsId(Long orderDetailsId) {
        this.orderDetailsId = orderDetailsId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceType() {
        return serviceType;
    }

    public void setServiceType(int serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc;
    }

    public Long getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Long servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getOrderCaregiverName() {
        return orderCaregiverName;
    }

    public void setOrderCaregiverName(String orderCaregiverName) {
        this.orderCaregiverName = orderCaregiverName;
    }

    public int getOrderCaregiverAge() {
        return orderCaregiverAge;
    }

    public void setOrderCaregiverAge(int orderCaregiverAge) {
        this.orderCaregiverAge = orderCaregiverAge;
    }

    public int getOrderCaregiverSex() {
        return orderCaregiverSex;
    }

    public void setOrderCaregiverSex(int orderCaregiverSex) {
        this.orderCaregiverSex = orderCaregiverSex;
    }

    public String getOrderCaregiverAddr() {
        return orderCaregiverAddr;
    }

    public void setOrderCaregiverAddr(String orderCaregiverAddr) {
        this.orderCaregiverAddr = orderCaregiverAddr;
    }

    public String getServiceStartTime() {
        return serviceStartTime;
    }

    public void setServiceStartTime(String serviceStartTime) {
        this.serviceStartTime = serviceStartTime;
    }

    public int getServicePlace() {
        return servicePlace;
    }

    public void setServicePlace(int servicePlace) {
        this.servicePlace = servicePlace;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Long getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(Long sysuserId) {
        this.sysuserId = sysuserId;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
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

    @Override
    public String toString() {
        return "NursingOrderDetails{" +
                "orderDetailsId=" + orderDetailsId +
                ", orderId=" + orderId +
                ", orderCode='" + orderCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType=" + serviceType +
                ", serviceDesc='" + serviceDesc + '\'' +
                ", servicePrice=" + servicePrice +
                ", serviceNumber=" + serviceNumber +
                ", orderAmount=" + orderAmount +
                ", productQuantity=" + productQuantity +
                ", payAmount=" + payAmount +
                ", paidAmount=" + paidAmount +
                ", orderCaregiverName='" + orderCaregiverName + '\'' +
                ", orderCaregiverAge=" + orderCaregiverAge +
                ", orderCaregiverSex=" + orderCaregiverSex +
                ", orderCaregiverAddr='" + orderCaregiverAddr + '\'' +
                ", serviceCity='" + serviceCity + '\'' +
                ", serviceDistrict='" + serviceDistrict + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", serviceStartTime='" + serviceStartTime + '\'' +
                ", servicePlace=" + servicePlace +
                ", createTime=" + createTime +
                ", orderStatus=" + orderStatus +
                ", sysuserId=" + sysuserId +
                '}';
    }
}
