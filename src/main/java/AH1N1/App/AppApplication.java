package AH1N1.App;

import AH1N1.App.configs.WebServiceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan({"AH1N1.App.AH1N1.App.endpoints","AH1N1.App.AH1N1.App.configs"})
//@Import(WebServiceConfig.class)
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }
}
