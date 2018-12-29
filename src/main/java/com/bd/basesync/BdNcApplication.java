package com.bd.basesync;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("com.bd.basesync")
@MapperScan("com.bd.basesync.dao")
@SpringBootApplication
public class BdNcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdNcApplication.class, args);
	}

}

