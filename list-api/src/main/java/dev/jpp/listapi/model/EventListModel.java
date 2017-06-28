package dev.jpp.listapi.model;

import java.util.List;

public class EventListModel {
	private int id;
	private EventModel event;
	private ListTypeModel listType;
	private List<GuestListModel> lists;
	
	public EventListModel() {
		super();
	}

	public EventListModel(int id, EventModel event, ListTypeModel listType, List<GuestListModel> lists) {
		super();
		this.id = id;
		this.event = event;
		this.listType = listType;
		this.lists = lists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EventModel getEvent() {
		return event;
	}

	public void setEvent(EventModel event) {
		this.event = event;
	}

	public ListTypeModel getListType() {
		return listType;
	}

	public void setListType(ListTypeModel listType) {
		this.listType = listType;
	}

	public List<GuestListModel> getLists() {
		return lists;
	}

	public void setLists(List<GuestListModel> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "EventListModel [id=" + id + ", event=" + event + ", listType=" + listType + ", lists=" + lists + "]";
	}
}
