package kr.co.joneconsulting.myrestfulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class MyRestfulServiceApplication {
	// Embedded tomcat 실행
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyRestfulServiceApplication.class, args);

		// 스프링에서 가지고 있는 모든 Bean 출력
//		String[] allBeanNames = ac.getBeanDefinitionNames();
//		for (String beanName: allBeanNames) {
//			System.out.println(beanName);
//		}
	}

	@Bean // 메모리에 빈으로 등록 
	public LocaleResolver localeResolver() {
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}
}
