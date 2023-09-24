package com.finzly.utilitybillpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.finzly.utilitybillpay")
public class UtilityBillPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtilityBillPayApplication.class, args);
	}
}
