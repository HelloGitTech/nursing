package com.xjx.nursing.enumeration;

import javax.xml.ws.Service;

public enum ServiceTypeEnum {
    MONTHLY(1,"月月护"),
    SINGLE(2,"按次/套餐");

    private int code;
    private String value;

    ServiceTypeEnum(int code, String value){
        this.code = code;
        this.value = value;
    }

    public static ServiceTypeEnum getServiceTypeEnumByCode(int code){
        for(ServiceTypeEnum serviceTypeEnum : ServiceTypeEnum.values()){
            if(serviceTypeEnum.getCode() == code)
                return serviceTypeEnum;
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
