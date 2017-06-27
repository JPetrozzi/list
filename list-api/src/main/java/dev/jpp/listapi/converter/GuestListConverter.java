package dev.jpp.listapi.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dev.jpp.listapi.entity.GuestList;
import dev.jpp.listapi.model.GuestListModel;

@Component("guestListConverter")
public class GuestListConverter implements IConverter<GuestList, GuestListModel> {

	@Autowired
	@Qualifier("eventConverter")
	private EventConverter eventConv;
	
	@Autowired
	@Qualifier("userConverter")
	private UserConverter userConv;
	
	@Override
	public GuestList modelToEntity(GuestListModel model) {
		return new GuestList(model.getId(), model.getRepresent(), userConv.modelToEntity(model.getCreator()), eventConv.modelToEntity(model.getEvent()), model.getNumberOfGuests(), model.getGuestsNames(), model.getPresents());
	}

	@Override
	public List<GuestList> listModelToListEntity(List<GuestListModel> models) {
		List<GuestList> entities = new ArrayList<>();
		
		for (GuestListModel model : models) {
			entities.add(this.modelToEntity(model));
		}
		
		return entities;
	}

	@Override
	public GuestListModel entityToModel(GuestList entity) {
		return new GuestListModel(entity.getId(), entity.getRepresent(), userConv.entityToModel(entity.getCreator()), eventConv.entityToModel(entity.getEvent()), entity.getNumberOfGuests(), entity.getGuestsNames(), entity.getPresents());
	}

	@Override
	public List<GuestListModel> listEntityToListModel(List<GuestList> entities) {
		List<GuestListModel> models = new ArrayList<>();
		
		for (GuestList entity : entities) {
			models.add(this.entityToModel(entity));
		}
		
		return models;
	}

}
