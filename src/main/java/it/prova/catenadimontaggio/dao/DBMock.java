package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.builder.AutomobileBuilder;
import it.prova.catenadimontaggio.builder.CatenaDiMontaggioBuilder;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DBMock {

	public static final List<SlotCatenaDiMontaggio> SLOT_CATENE_DI_MONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();

	static {

		try {

			SlotCatenaDiMontaggio catena1 = CatenaDiMontaggioBuilder.newBuilder(1l)
					.brand("Toyota")
					.country("Italia")
					.build();
			Automobile automobile1 = AutomobileBuilder.newBuilder(1l)
					.modello("Toyota Corallo")
					.telaio("Traliccio")
					.dataProduzione(new SimpleDateFormat("dd/MM/yyyy").parse("04/06/2015"))
					.slotCatenaDiMontaggio(catena1)
					.build();
			catena1.getAutomobili().add(automobile1);
			Automobile automobile2 = AutomobileBuilder.newBuilder(2l)
					.modello("Toyota RAV4")
					.telaio("Traliccio")
					.dataProduzione(new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2017"))
					.slotCatenaDiMontaggio(catena1)
					.build();
			catena1.getAutomobili().add(automobile2);
			Automobile automobile3 = AutomobileBuilder.newBuilder(3l)
					.modello("Toyota Supra")
					.telaio("Supra")
					.dataProduzione(new SimpleDateFormat("dd/MM/yyyy").parse("21/01/2018"))
					.slotCatenaDiMontaggio(catena1)
					.build();
			catena1.getAutomobili().add(automobile3);
			
			SLOT_CATENE_DI_MONTAGGIO.add(catena1);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
