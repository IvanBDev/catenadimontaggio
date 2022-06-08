package it.prova.catenadimontaggio;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.builder.AutomobileBuilder;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner{
	
	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SlotCatenaDiMontaggio catenaDiMontaggio = catenaDiMontaggioService.caricaCatenaDiMontaggio(1l);
		
		//Aggiungo una nuova Auto
		Automobile nuovaAutomobile = AutomobileBuilder.newBuilder(4l)
				.modello("Toyota Aygo X")
				.telaio("Acciaio")
				.dataProduzione(new SimpleDateFormat("dd/MM/yyyy").parse("25/02/2022"))
				.build();
		
		//Aggiungo l'automobile alla catena di montaggio
		catenaDiMontaggioService.aggiungiAutoACatenaDiMontaggio(catenaDiMontaggio, nuovaAutomobile);
		
		catenaDiMontaggioService.avviaCatenaDiMontaggio(catenaDiMontaggio);
		
	}

}
