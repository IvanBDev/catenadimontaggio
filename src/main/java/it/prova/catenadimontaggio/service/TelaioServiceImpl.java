package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class TelaioServiceImpl implements TelaioService{

	@Override
	public void aggiuntaTelaio(Automobile automobileInput) {
		// TODO Auto-generated method stub
		System.out.println("Telaio: "+ automobileInput.getTelaio() +" aggiunto a "+ automobileInput);
	}

}
