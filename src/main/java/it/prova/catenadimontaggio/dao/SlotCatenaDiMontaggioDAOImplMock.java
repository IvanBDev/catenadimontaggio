package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImplMock implements SlotCatenaDiMontaggioDAO{

	@Override
	public void addCarToAssemblyLine(SlotCatenaDiMontaggio slotCatenaDiMontaggioInstance,
			Automobile automobileInstance) {
		// TODO Auto-generated method stub
		
		automobileInstance.setSlotCatenaDiMontaggio(slotCatenaDiMontaggioInstance);
		for (SlotCatenaDiMontaggio SlotCatenaItem : DBMock.SLOT_CATENE_DI_MONTAGGIO) {
			if(SlotCatenaItem.getId() == slotCatenaDiMontaggioInstance.getId()) {
				SlotCatenaItem.addToAutomobili(automobileInstance);
			}
		}
		
	}

	@Override
	public SlotCatenaDiMontaggio getAssemblyLine(Long id) {
		// TODO Auto-generated method stub
		for (SlotCatenaDiMontaggio catenaItem : DBMock.SLOT_CATENE_DI_MONTAGGIO) {
			if (catenaItem.getId() == id) {
				return catenaItem;
			}
		}
		
		return null;
		
	}

}
