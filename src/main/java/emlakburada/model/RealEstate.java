package emlakburada.model;

import emlakburada.model.enums.KonutType;

import javax.persistence.*;

@Entity
public class RealEstate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne(fetch = FetchType.EAGER)
	private Address adres;
	private KonutType konutType;
	private String odaSayisi = "3+1";
	private int alan = 145;
	private int bulunduguKat = 3;
	
	
	public RealEstate() {
	}


	public RealEstate(Integer id, Address adres, KonutType konutType, String odaSayisi, int alan, int bulunduguKat) {
		this.id = id;
		this.adres = adres;
		this.konutType = konutType;
		this.odaSayisi = odaSayisi;
		this.alan = alan;
		this.bulunduguKat = bulunduguKat;
	}

	
}