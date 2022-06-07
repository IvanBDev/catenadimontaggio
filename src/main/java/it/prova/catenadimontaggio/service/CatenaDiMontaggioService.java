package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatena);
	
	public void aggiungiAutoACatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaInput, Automobile automobileInput);
	
	public SlotCatenaDiMontaggio caricaCatenaDiMontaggio(Long id);
	
}
