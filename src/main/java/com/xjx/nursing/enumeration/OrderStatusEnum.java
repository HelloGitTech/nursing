package com.xjx.nursing.enumeration;

public enum OrderStatusEnum {
    SUBSCRIBED(0,"已预约"),
    PAID(1,"已支付"),
    FINISHED(2,"已完成");

    private int code;
    private String value;
    OrderStatusEnum(int code, String value){
        this.code = code;
        this.value = value;
    }
    public static OrderStatusEnum getEnumById(int code){
        for(OrderStatusEnum statusEnum : OrderStatusEnum.values()){
            if(statusEnum.getCode() == code)
                return statusEnum;
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
