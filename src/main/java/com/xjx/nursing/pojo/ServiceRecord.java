package com.xjx.nursing.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.xjx.nursing.enumeration.SexEnum;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ServiceRecord {
    private Long recordId;
    private Long orderId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date startTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date endTime;
    private String workerName;
    private int workerSex;
    private int workerAge;
    private String workerPhone;

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(int workerSex) {
        this.workerSex = workerSex;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    @Override
    public String toString() {
        return "ServiceRecord{" +
                "recordId=" + recordId +
                ", orderId=" + orderId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", workerName='" + workerName + '\'' +
                ", workerSex=" + workerSex +
                ", workerAge=" + workerAge +
                ", workerPhone='" + workerPhone + '\'' +
                '}';
    }
}
