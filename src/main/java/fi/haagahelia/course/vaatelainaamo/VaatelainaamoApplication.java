package fi.haagahelia.course.vaatelainaamo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import fi.haagahelia.course.vaatelainaamo.domain.Kayttaja;
import fi.haagahelia.course.vaatelainaamo.domain.KayttajaRepository;
import fi.haagahelia.course.vaatelainaamo.domain.Vaate;
import fi.haagahelia.course.vaatelainaamo.domain.VaateRepository;



@SpringBootApplication
public class VaatelainaamoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaatelainaamoApplication.class, args);
	}
	
	@Bean  //voi lisätä demomateriaalia tietokantaan  
	public CommandLineRunner demo (VaateRepository vrepository, KayttajaRepository krepository){
		return(args) -> {
			Vaate UllanHame =  new Vaate ("Marimekko","S","hame",70);
			Vaate EllanPaita =  new Vaate ("Nanso","M","mekko",50);
			
			vrepository.save(UllanHame);
			vrepository.save(EllanPaita);

			// Käyttäjien luominen
			Kayttaja kayttaja1 = new Kayttaja ("käyttäjä", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			Kayttaja kayttaja2 = new Kayttaja ("ylläpitäjä", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			krepository.save(kayttaja1);
			krepository.save(kayttaja2);			
			
			
			};
		
	}

}

