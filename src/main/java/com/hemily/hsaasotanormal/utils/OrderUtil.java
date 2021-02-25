package com.hemily.hsaasotanormal.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 订单相关方法
 */
public class OrderUtil {

    /**
     * 生成订单号 25位
     * 业务类型(2位)+支付方式(1位)+商户id(4位)+年月日(6位)+时间戳(后5位)+当前微秒(4位)+随机数(3位)
     * 业务类型：ota-21，旅行社-22
     * 支付方式：1-在线，2-到付
     *
     * @param merchantId 商户id
     * @return
     */
    public static String getOrderNo(String merchantId) {
        String result = "211";
        LocalDateTime now = LocalDateTime.now();
        result += merchantId.substring(merchantId.length() - 5, merchantId.length() - 1);
        result += DateTimeFormatter.ofPattern("yyyyMMdd").format(now).substring(2, 7);
        long time = now.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        result += (time + "").substring(5, 9);
        result += DateTimeFormatter.ofPattern("SSSSSS").format(now).substring(2, 5);
        result += (new Random().nextInt(900) + 100);
        return result;
    }


    public static String getEcode() {
        return "";
    }

    public static String getUnique() {
        return "";
    }

}
