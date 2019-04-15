package fi.haagahelia.course.vaatelainaamo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


import fi.haagahelia.course.vaatelainaamo.domain.Vaate;
import fi.haagahelia.course.vaatelainaamo.domain.VaateRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class VaateRepositoryTest {
	
	@Autowired
	private VaateRepository repository;

	@Test
	public void findByMerkkiShouldReturnVaate() {
        List<Vaate> vaatteet = repository.findByMerkki("Marimekko");
        
        assertThat(vaatteet).hasSize(1);
        assertThat(vaatteet.get(0).getMerkki()).isEqualTo("Marimekko");		
		
	}
    @Test
    public void createNewStudent() {
    	Vaate vaate = new Vaate("Marimekko", "S", "Mekko", 70);
    	repository.save(vaate);
    	assertThat(vaate.getId()).isNotNull();
    } 

}



