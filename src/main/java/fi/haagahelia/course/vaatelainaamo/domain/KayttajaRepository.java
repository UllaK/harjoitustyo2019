package fi.haagahelia.course.vaatelainaamo.domain;

import org.springframework.data.repository.CrudRepository;

//rajapinta, joka tarjoaa CRUD-toiminnon kayttaja-entityyn 

public interface KayttajaRepository extends  CrudRepository<Kayttaja, Long> {
	Kayttaja findByUsername(String username);
}
