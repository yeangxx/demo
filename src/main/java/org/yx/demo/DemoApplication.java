package org.yx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
@ComponentScan("org.yx.web")
public class DemoApplication {

	@RequestMapping("hello1")
	@ResponseBody
	public String sayHello(){
		return "hellooooooooooo";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

