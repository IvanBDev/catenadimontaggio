package it.prova.catenadimontaggio.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
			Automobile automobile1 = new Automobile(1l, "Toyota Corallo", "Traliccio",
					new SimpleDateFormat("dd/MM/yyyy").parse("04/06/2015"), catena1);
			catena1.getAutomobili().add(automobile1);
			Automobile automobile2 = new Automobile(2l, "Toyota RAV4", "Traliccio",
					new SimpleDateFormat("dd/MM/yyyy").parse("12/08/2017"), catena1);
			catena1.getAutomobili().add(automobile2);
			Automobile automobile3 = new Automobile(3l, "Toyota Supra", "Misti",
					new SimpleDateFormat("dd/MM/yyyy").parse("21/01/2018"), catena1);
			catena1.getAutomobili().add(automobile3);
			
			SLOT_CATENE_DI_MONTAGGIO.add(catena1);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
