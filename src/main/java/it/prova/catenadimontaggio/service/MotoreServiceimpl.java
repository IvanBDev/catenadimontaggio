package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class MotoreServiceimpl implements MotoreService{

	@Override
	public void aggiuntaMotore(Automobile automobileItem) {
		// TODO Auto-generated method stub
		System.out.println("Motore aggiunto a "+ automobileItem);
	}

}
