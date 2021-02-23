package com.hemily.hsaasotanormal;

import com.hemily.hsaasotanormal.base.APIResult;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@RequestMapping("/err")
	public static APIResult error(){
		return APIResult.error();
	}

}
