package fi.haagahelia.course.vaatelainaamo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size; //yritin validoida, mutta en saanut toimimaan


@Entity //että jpa tietää että kyseessä on entity, joka edustaa taulukkoa tietokannasa
public class Vaate {
	@Id //uniikki id
	@GeneratedValue(strategy=GenerationType.AUTO) //automaattisesti generoitu tietokannasta
	private long id;	
	private String merkki, koko, kuvaus;
	private int hinta;
	
	// getterit ja setterit tarvitaan viewlle
	
	public Vaate() {}

	public Vaate(String merkki, String koko, String kuvaus, int hinta) { 
		super();
		this.merkki = merkki;
		this.koko = koko;
		this.kuvaus = kuvaus;
		this.hinta = hinta;
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
	
	
	public int getHinta() {
		return hinta;
	}

	public void setHinta(int hinta) {
		this.hinta = hinta;
	}

	@Override
	public String toString() {
		return "Vaate [id=" + id + ", merkki=" + merkki + ", koko=" + koko + ", kuvaus=" + kuvaus + ", hinta=" + hinta
				+ "]";
	}
	
	
		
	
}
