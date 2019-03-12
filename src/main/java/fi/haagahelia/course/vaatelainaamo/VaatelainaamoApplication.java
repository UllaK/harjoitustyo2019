package fi.haagahelia.course.vaatelainaamo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.course.vaatelainaamo.domain.Vaate;
import fi.haagahelia.course.vaatelainaamo.domain.VaateRepository;

@SpringBootApplication
public class VaatelainaamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaatelainaamoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo (VaateRepository repository){
		return(args) -> {
			Vaate v1 = new Vaate ("Marimekko", "M", "pitkä mekko", 80);
			Vaate v2 = new Vaate ("Filippa K", "S", "silkkipaita", 70);
			Vaate v3 = new Vaate ("R/H", "L", "lyhyt mekko", 60);
			
			repository.save(v1);
			repository.save(v2);
			repository.save(v3 );

			};
		
	}

}

