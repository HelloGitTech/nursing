package com.xjx.nursing.vo;

import com.xjx.nursing.enumeration.OrderStatusEnum;

import java.util.Date;

public class NursingOrderVO {
    private Long orderId;
    private String orderCode;
    private String serviceName;
    private Date createTime;
    private Long orderAmount;
    private Long paidAmount;
    //状态
    private int orderStatus;
    //状态名称
    private String orderStatusName;
    private Long sysuserId;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public Long getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(Long sysuserId) {
        this.sysuserId = sysuserId;
    }

    @Override
    public String toString() {
        return "NursingOrderVO{" +
                "orderId=" + orderId +
                ", orderCode='" + orderCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", createTime=" + createTime +
                ", orderAmount=" + orderAmount +
                ", paidAmount=" + paidAmount +
                ", orderStatus=" + orderStatus +
                ", orderStatusName='" + orderStatusName + '\'' +
                ", sysuserId=" + sysuserId +
                '}';
    }
}
