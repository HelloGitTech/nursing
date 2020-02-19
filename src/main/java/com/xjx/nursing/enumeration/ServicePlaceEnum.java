package com.xjx.nursing.enumeration;

public enum ServicePlaceEnum {
    HOSTPITAL(1,"医院"),
    HOME(2,"居家");

    private int code;
    private String value;

    ServicePlaceEnum(int code, String value){
        this.code = code;
        this.value = value;
    }

    public static ServicePlaceEnum getServicePlaceEnumByCode(int code){
        for(ServicePlaceEnum servicePlaceEnum : ServicePlaceEnum.values()){
            if(servicePlaceEnum.getCode() == code)
                return servicePlaceEnum;
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
