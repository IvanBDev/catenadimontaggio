package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService{
	
	@Autowired
	private TelaioService telaioService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;

	@Override
	public void avviaCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatena) {
		// TODO Auto-generated method stub
		System.out.println(".............................Inizio catena di montaggio..................................");
		for (Automobile automobileItem : slotCatena.getAutomobili()) {
			System.out.println("/////////////////////////////////////////////////////////////////");
			System.out.println("Inizio catena di montaggio per l'automobile: "+ automobileItem);
			telaioService.aggiuntaTelaio(automobileItem);
			motoreService.aggiuntaMotore(automobileItem);
			impiantoElettricoService.aggiuntaImpiantoElettrico(automobileItem);
			carrozzeriaService.aggiuntaCarrozzeria(automobileItem);
			provaSuStradaService.testSuStrada(automobileItem);
			System.out.println("Fine catena di montaggio per l'automobile: "+ automobileItem);
			System.out.println("/////////////////////////////////////////////////////////////////");
		}
		
		System.out.println(".............................Fine catena di montaggio..................................");
		
	}

	@Override
	public void aggiungiAutoACatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaInput, Automobile automobileInput) {
		// TODO Auto-generated method stub
		slotCatenaDiMontaggioDAO.addCarToAssemblyLine(slotCatenaInput, automobileInput);
	}

	@Override
	public SlotCatenaDiMontaggio caricaCatenaDiMontaggio(Long id) {
		// TODO Auto-generated method stub
		return slotCatenaDiMontaggioDAO.getAssemblyLine(id);
	}

}
