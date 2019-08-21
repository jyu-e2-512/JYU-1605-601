package cn.jyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.jyu.heatingfeesystem.mapper"})
public class HeatingFeeSystem09Application {

	public static void main(String[] args) {
		SpringApplication.run(HeatingFeeSystem09Application.class, args);
	}

}
