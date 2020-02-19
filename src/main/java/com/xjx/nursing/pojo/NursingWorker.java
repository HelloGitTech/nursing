package com.xjx.nursing.pojo;

import com.xjx.nursing.enumeration.MarriageEnum;
import com.xjx.nursing.enumeration.SexEnum;
import com.xjx.nursing.enumeration.WorkerStatusEnum;

public class NursingWorker {
    private Long workerId;
    private String workerName;
    private SexEnum workerSex;
    private int workerAge;
    private int workerHeight;
    private int workerWeight;
    private String workerBloodType;
    private String workerEducation;
    private String workerPhone;
    private String workerConstellation;
    private String workerZodiac;
    private MarriageEnum workerMarriage;
    private String workerNativePlace;
    private String workerScope;
    private WorkerStatusEnum workerStatus;
    private int workerServiceNum;
    private int workerPraiseRate;
    private String workerSelfIntroduce;
    private String workerPhoto;

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public SexEnum getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(SexEnum workerSex) {
        this.workerSex = workerSex;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }

    public String getWorkerNativePlace() {
        return workerNativePlace;
    }

    public void setWorkerNativePlace(String workerNativePlace) {
        this.workerNativePlace = workerNativePlace;
    }

    public String getWorkerScope() {
        return workerScope;
    }

    public void setWorkerScope(String workerScope) {
        this.workerScope = workerScope;
    }

    public WorkerStatusEnum getWorkerStatus() {
        return workerStatus;
    }

    public void setWorkerStatus(WorkerStatusEnum workerStatus) {
        this.workerStatus = workerStatus;
    }

    public int getWorkerServiceNum() {
        return workerServiceNum;
    }

    public void setWorkerServiceNum(int workerServiceNum) {
        this.workerServiceNum = workerServiceNum;
    }

    public int getWorkerPraiseRate() {
        return workerPraiseRate;
    }

    public void setWorkerPraiseRate(int workerPraiseRate) {
        this.workerPraiseRate = workerPraiseRate;
    }

    public int getWorkerHeight() {
        return workerHeight;
    }

    public void setWorkerHeight(int workerHeight) {
        this.workerHeight = workerHeight;
    }

    public int getWorkerWeight() {
        return workerWeight;
    }

    public void setWorkerWeight(int workerWeight) {
        this.workerWeight = workerWeight;
    }

    public String getWorkerBloodType() {
        return workerBloodType;
    }

    public void setWorkerBloodType(String workerBloodType) {
        this.workerBloodType = workerBloodType;
    }

    public String getWorkerEducation() {
        return workerEducation;
    }

    public void setWorkerEducation(String workerEducation) {
        this.workerEducation = workerEducation;
    }

    public String getWorkerConstellation() {
        return workerConstellation;
    }

    public void setWorkerConstellation(String workerConstellation) {
        this.workerConstellation = workerConstellation;
    }

    public String getWorkerZodiac() {
        return workerZodiac;
    }

    public void setWorkerZodiac(String workerZodiac) {
        this.workerZodiac = workerZodiac;
    }

    public MarriageEnum getWorkerMarriage() {
        return workerMarriage;
    }

    public void setWorkerMarriage(MarriageEnum workerMarriage) {
        this.workerMarriage = workerMarriage;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public String getWorkerSelfIntroduce() {
        return workerSelfIntroduce;
    }

    public void setWorkerSelfIntroduce(String workerSelfIntroduce) {
        this.workerSelfIntroduce = workerSelfIntroduce;
    }

    public String getWorkerPhoto() {
        return workerPhoto;
    }

    public void setWorkerPhoto(String workerPhoto) {
        this.workerPhoto = workerPhoto;
    }

    @Override
    public String toString() {
        return "NursingWorker{" +
                "workerId=" + workerId +
                ", workerName='" + workerName + '\'' +
                ", workerSex=" + workerSex +
                ", workerAge=" + workerAge +
                ", workerHeight=" + workerHeight +
                ", workerWeight=" + workerWeight +
                ", workerBloodType='" + workerBloodType + '\'' +
                ", workerEducation='" + workerEducation + '\'' +
                ", workerPhone='" + workerPhone + '\'' +
                ", workerConstellation='" + workerConstellation + '\'' +
                ", workerZodiac='" + workerZodiac + '\'' +
                ", workerMarriage=" + workerMarriage +
                ", workerNativePlace='" + workerNativePlace + '\'' +
                ", workerScope='" + workerScope + '\'' +
                ", workerStatus=" + workerStatus +
                ", workerServiceNum=" + workerServiceNum +
                ", workerPraiseRate=" + workerPraiseRate +
                ", workerSelfIntroduce='" + workerSelfIntroduce + '\'' +
                ", workerPhoto='" + workerPhoto + '\'' +
                '}';
    }
}
