package dev.jpp.listapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lst_event_list")
public class EventList {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="event_id", nullable=false)
	private Event event;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="listType_id", nullable=false)
	private ListType listType;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="event")
	private List<GuestList> guestLists;

	public EventList() {
		super();
	}

	public EventList(int id, Event event, ListType listType, List<GuestList> guestLists) {
		super();
		this.id = id;
		this.event = event;
		this.listType = listType;
		this.guestLists = guestLists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public ListType getListType() {
		return listType;
	}

	public void setListType(ListType listType) {
		this.listType = listType;
	}

	public List<GuestList> getGuestLists() {
		return guestLists;
	}

	public void setGuestLists(List<GuestList> guestLists) {
		this.guestLists = guestLists;
	}

	@Override
	public String toString() {
		return "EventList [id=" + id + ", event=" + event + ", listType=" + listType + ", lists=" + guestLists + "]";
	}
}
