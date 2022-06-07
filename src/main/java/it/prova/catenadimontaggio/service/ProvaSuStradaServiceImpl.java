package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService{

	@Override
	public void testSuStrada(Automobile automobileInput) {
		// TODO Auto-generated method stub
		System.out.println("Effettuata prova su strada per l'auto "+ automobileInput);
	}

}
