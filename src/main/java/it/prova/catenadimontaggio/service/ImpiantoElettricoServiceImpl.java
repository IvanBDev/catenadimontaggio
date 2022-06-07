package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ImpiantoElettricoServiceImpl implements ImpiantoElettricoService{

	@Override
	public void aggiuntaImpiantoElettrico(Automobile automobileInput) {
		// TODO Auto-generated method stub
		System.out.println("Impianto elettrico a "+ automobileInput);
	}

}
