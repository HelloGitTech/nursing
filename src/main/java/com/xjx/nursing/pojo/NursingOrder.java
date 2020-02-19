package com.xjx.nursing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjx.nursing.enumeration.OrderStatusEnum;

import java.util.Date;

public class NursingOrder {
    private Long orderId;
    private String orderCode;
    private String serviceName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private Long orderAmount;
    private Long payAmount;
    private Long paidAmount;
    private OrderStatusEnum orderStatus;
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

    @Override
    public String toString() {
        return "NursingOrder{" +
                "orderId=" + orderId +
                ", orderCode='" + orderCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", createTime=" + createTime +
                ", orderAmount=" + orderAmount +
                ", payAmount=" + payAmount +
                ", paidAmount=" + paidAmount +
                ", orderStatus=" + orderStatus +
                ", sysuserId=" + sysuserId +
                '}';
    }
}
