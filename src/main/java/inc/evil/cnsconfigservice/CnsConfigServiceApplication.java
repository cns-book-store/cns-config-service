package inc.evil.cnsconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CnsConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnsConfigServiceApplication.class, args);
	}

}
