package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface SlotCatenaDiMontaggioDAO {
	
	public void addCarToAssemblyLine(SlotCatenaDiMontaggio slotCatenaDiMontaggioInstance, Automobile automobileInstance);
	
	public SlotCatenaDiMontaggio getAssemblyLine(Long id);
	
}
