package dev.jpp.listapi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lst_event_list")
public class EventList {
	private int id;
	private Event event;
	private ListType listType;
	private List<GuestList> lists;
}
