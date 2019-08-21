package cn.jyu.heatingfeesystem.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cn.jyu.heatingfeesystem.service.HeatingPriceService;
import cn.jyu.heatingfeesytem.config.AppConfig;


public class ChenWujieTest {
	public static void main(String[] args) throws Exception {
		ApplicationContext acforconfig = new AnnotationConfigApplicationContext(AppConfig.class);
		HeatingPriceService heatingPriceService = acforconfig.getBean("heatingPriceService",HeatingPriceService.class);
		System.out.println(heatingPriceService.selectCountByAll());
	}
}
