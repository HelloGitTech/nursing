package com.xjx.nursing.enumeration;

public enum SexEnum {
    MALE(1,"男"),
    FEMALE(2,"女");

    private int code;
    private String value;
    SexEnum(int code,String value){
        this.code = code;
        this.value = value;
    }

    public static SexEnum getSexEnumByCode(int code){
        for(SexEnum sexEnum : SexEnum.values()){
            if(sexEnum.getCode() == code)
                return sexEnum;
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
