package l2.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import l2.blog.controller.MenuController;

@SpringBootApplication
@ComponentScan(basePackages="l2.blog")
public class BlogApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BlogApplication.class, args);
		
	}

}
