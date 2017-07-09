package tr.com.yd.tabak.restapi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"tr.com.yd.tabak.restapi.dao","tr.com.yd.tabak.restapi.converter","tr.com.yd.tabak.restapi.service","tr.com.yd.tabak.restapi.rest"})
public class RestApiApp {

		public static void main(String[] args) {
			SpringApplication.run(RestApiApp.class, args);
		}
}
