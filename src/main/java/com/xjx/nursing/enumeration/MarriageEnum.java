package com.xjx.nursing.enumeration;

public enum MarriageEnum {
    UNMARRIED(0,"未婚"),
    MARRIED(1,"已婚");

    private int code;
    private String value;
    MarriageEnum(int code,String value){
        this.code = code;
        this.value = value;
    }

    public static MarriageEnum getMarriageEnumByCode(int code){
        for(MarriageEnum marriageEnum : MarriageEnum.values()){
            if(marriageEnum.getCode() == code)
                return marriageEnum;
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
