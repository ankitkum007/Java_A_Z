package com.College;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.College")
public class CollegeConfig {	
	@Bean("colg1")
	public College getCollege() {
		College c = new College(7408, "JCT", 10000.10);
		return c;
	}
	
	@Bean("colg2")
	public College getCollege2() {
		College col = new College();
		col.setId(1000);
		col.setName("IIT");
		col.setFeeStructure(500000);
		return col;
	}
	@Bean("colg3")
	public College getCollege3() {
		College col = new College();
		col.setId(1020);
		col.setName("IIM");
		col.setFeeStructure(1500000);
		return col;
	}
}
