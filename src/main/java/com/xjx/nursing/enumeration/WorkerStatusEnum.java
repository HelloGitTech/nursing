package com.xjx.nursing.enumeration;

public enum WorkerStatusEnum {
    IDLE(0,"空闲"),
    WORKING(1,"在岗");

    private int code;
    private String value;

    WorkerStatusEnum(int code,String value){
        this.code = code;
        this.value = value;
    }

    public static WorkerStatusEnum getWorkerStatusEnumByCode(int code){
        for(WorkerStatusEnum workerStatusEnum:WorkerStatusEnum.values()){
            if(workerStatusEnum.code == code)
                return workerStatusEnum;
        }
        return null;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
