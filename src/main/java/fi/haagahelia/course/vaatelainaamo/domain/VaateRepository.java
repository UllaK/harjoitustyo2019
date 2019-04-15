package fi.haagahelia.course.vaatelainaamo.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//rajapinta, joka tarjoaa CRUD-toiminnon vaate-entityyn 

public interface VaateRepository extends CrudRepository <Vaate, Long>{
	List<Vaate>findByMerkki(String merkki);
}




