package com.xjx.nursing.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 生成订单唯一主键，纯数字
 */
public class KeyUtil {
    /**
     * 生成主键id
     * 时间+随机数
     */
    public static synchronized String generateUniqueKey(){
        Random random = new Random();
        Integer r = random.nextInt(90000) + 10000;

        Long timeMillis = System.currentTimeMillis();

        DateFormat sdf = new SimpleDateFormat("HHmmssSSS");
        String timeStr = sdf.format(new Date());

        return  timeStr + r;
    }

    public static void main(String[] args){
        System.out.println(generateUniqueKey());
    }
}