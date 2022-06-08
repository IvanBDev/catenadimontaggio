package it.prova.catenadimontaggio.builder;


import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public final class CatenaDiMontaggioBuilder {
	
	private Long id;
	private String brand;
	private String country;
	
	private CatenaDiMontaggioBuilder(Long id) {
		this.id = id;
	}
	
	public static CatenaDiMontaggioBuilder newBuilder(Long id) {
		return new CatenaDiMontaggioBuilder(id);
	}
	
	public CatenaDiMontaggioBuilder brand(String brand) {
		this.brand = brand;
		return this;
	}
	
	public CatenaDiMontaggioBuilder country(String country) {
		this.country = country;
		return this;
	}
	
	public SlotCatenaDiMontaggio build() {
		return new SlotCatenaDiMontaggio(id, brand, country);
	}
	
}
