package devopsintegration.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.plaf.PanelUI;

@SpringBootApplication
public class DevopsApplication {

	@GetMapping
	public String message(){ return "welcome to javatechie";}

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}
