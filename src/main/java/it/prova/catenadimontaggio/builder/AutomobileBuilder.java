package it.prova.catenadimontaggio.builder;

import java.util.Date;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class AutomobileBuilder {
	
	private Long id;
	private String modello;
	private String telaio;
	private Date dataProduzione;
	private SlotCatenaDiMontaggio slotCatenaDiMontaggio;
	
	private AutomobileBuilder(Long id) {
		this.id = id;
	}
	
	public static AutomobileBuilder newBuilder(Long id) {
		return new AutomobileBuilder(id);
		}
	
	public AutomobileBuilder modello(String modello) {
		this.modello = modello;
		return this;
	}
	
	public AutomobileBuilder telaio(String telaio) {
		this.telaio = telaio;
		return this;
	}
	
	public AutomobileBuilder dataProduzione(Date dataProduzione) {
		this.dataProduzione = dataProduzione;
		return this;
	}
	
	public AutomobileBuilder slotCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		this.slotCatenaDiMontaggio = slotCatenaDiMontaggio;
		return this;
	}
	
	public Automobile build() {
		return new Automobile(id, modello, telaio, dataProduzione, slotCatenaDiMontaggio);
	}

}
