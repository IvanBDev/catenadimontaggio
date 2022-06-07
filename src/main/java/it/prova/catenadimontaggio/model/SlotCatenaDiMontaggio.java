package it.prova.catenadimontaggio.model;

import java.util.ArrayList;

public class SlotCatenaDiMontaggio {
	
	private Long id;
	private String brand;
	private String country;
	private ArrayList<Automobile> automobili = new ArrayList<Automobile>();
	
	public SlotCatenaDiMontaggio(String brand, String country, ArrayList<Automobile> automobili) {
		super();
		this.brand = brand;
		this.country = country;
		this.automobili = automobili;
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country, ArrayList<Automobile> automobili) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
		this.automobili = automobili;
	}

	public SlotCatenaDiMontaggio(String brand, String country) {
		super();
		this.brand = brand;
		this.country = country;
	}
	

	public SlotCatenaDiMontaggio(Long id, String brand, String country) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
	}

	public SlotCatenaDiMontaggio() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public ArrayList<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(ArrayList<Automobile> automobili) {
		this.automobili = automobili;
	}
	
	public void addToAutomobili(Automobile automobile) {
		this.automobili.add(automobile);
	}
	
}
