package com.hemily.hsaasotanormal;

import com.hemily.hsaasotanormal.dto.APIResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * 系统入口
 */
@SpringBootApplication
@RestController
public class HsaasOtanormalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsaasOtanormalApplication.class, args);
	}

	@RequestMapping("/")
	public static String hello(){
		return  "贺米粒SaaS系统OTA接口";
	}

	/**
	 * 返回服务器时间和时间戳
	 * 用于请求方校正时间戳,避免签名错误
	 * @return
	 */
	@RequestMapping("/time")
	public static APIResult time(){
		Map<String,Object> data=new HashMap<>();
		LocalDateTime now= LocalDateTime.now();
		data.put("datetime",DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now));
		data.put("timestamp",now.toEpochSecond(ZoneOffset.of("+8")));
		return APIResult.success(data);
	}

}
