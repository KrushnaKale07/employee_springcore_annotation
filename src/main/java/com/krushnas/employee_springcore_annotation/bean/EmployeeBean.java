package com.krushnas.employee_springcore_annotation.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeBean {

	@Value("1")
	private int id;

	@Value("Ketan")
	private String name;

	@Value("ketan@gmail.com")
	private String email;

	@Value("Ravet")
	private String adress;
}
