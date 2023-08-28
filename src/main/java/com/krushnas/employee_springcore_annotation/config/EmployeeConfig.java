package com.krushnas.employee_springcore_annotation.config;

import org.springframework.context.annotation.Bean;

import com.krushnas.employee_springcore_annotation.bean.EmployeeBean;

public class EmployeeConfig {
	
	@Bean
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}
}
