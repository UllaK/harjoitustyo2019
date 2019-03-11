package fi.haagahelia.course.vaatelainaamo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaate {
	@Id //uniikki id
	@GeneratedValue(strategy=GenerationType.AUTO) //automaattisesti generoitu tietokannasta
	private long id;
	
	private String merkki, koko, kuvaus;
	
	public Vaate() {}

	public Vaate(String merkki, String koko, String kuvaus) {
		super();
		this.merkki = merkki;
		this.koko = koko;
		this.kuvaus = kuvaus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMerkki() {
		return merkki;
	}

	public void setMerkki(String merkki) {
		this.merkki = merkki;
	}

	public String getKoko() {
		return koko;
	}

	public void setKoko(String koko) {
		this.koko = koko;
	}

	public String getKuvaus() {
		return kuvaus;
	}

	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	
	
}
