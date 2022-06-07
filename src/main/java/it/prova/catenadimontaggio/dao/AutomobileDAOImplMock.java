package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class AutomobileDAOImplMock implements AutomobileDAO{

	@Override
	public void insert(Automobile input) {
		// TODO Auto-generated method stub
		for (SlotCatenaDiMontaggio SlotCatenaItem : DBMock.SLOT_CATENE_DI_MONTAGGIO) {
			if(SlotCatenaItem.getId() == input.getSlotCatenaDiMontaggio().getId()) {
				SlotCatenaItem.addToAutomobili(input);
			}
		}
	}

}
