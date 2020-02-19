package com.xjx.nursing.vo;

import com.xjx.nursing.pojo.NursingWorker;

public class NursingWorkerVO extends NursingWorker {
    private int workerSexCode;
    private int workerStatusCode;
    private int workerMarriageCode;

    public int getWorkerSexCode() {
        return workerSexCode;
    }

    public void setWorkerSexCode(int workerSexCode) {
        this.workerSexCode = workerSexCode;
    }

    public int getWorkerStatusCode() {
        return workerStatusCode;
    }

    public void setWorkerStatusCode(int workerStatusCode) {
        this.workerStatusCode = workerStatusCode;
    }

    public int getWorkerMarriageCode() {
        return workerMarriageCode;
    }

    public void setWorkerMarriageCode(int workerMarriageCode) {
        this.workerMarriageCode = workerMarriageCode;
    }
}
