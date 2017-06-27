package dev.jpp.listapi.model;

public class GuestListModel {
	private int id;
	private String represent;
	private UserModel creator;
	private EventModel event;
	private int numberOfGuests;
	private String guestsNames;
	private int presents;
	
	public GuestListModel() {
		super();
	}
	
	public GuestListModel(int id, String represent, UserModel creator, EventModel event, int numberOfGuests, String guestsNames, int presents) {
		super();
		this.id = id;
		this.represent = represent;
		this.creator = creator;
		this.event = event;
		this.numberOfGuests = numberOfGuests;
		this.guestsNames = guestsNames;
		this.presents = presents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRepresent() {
		return represent;
	}

	public void setRepresent(String represent) {
		this.represent = represent;
	}

	public UserModel getCreator() {
		return creator;
	}

	public void setCreator(UserModel creator) {
		this.creator = creator;
	}

	public EventModel getEvent() {
		return event;
	}

	public void setEvent(EventModel event) {
		this.event = event;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public String getGuestsNames() {
		return guestsNames;
	}

	public void setGuestsNames(String guestsNames) {
		this.guestsNames = guestsNames;
	}

	public int getPresents() {
		return presents;
	}

	public void setPresents(int presents) {
		this.presents = presents;
	}

	@Override
	public String toString() {
		return "GuestListModel [id=" + id + ", represent=" + represent + ", creator=" + creator + ", event=" + event
				+ ", numberOfGuests=" + numberOfGuests + ", guestsNames=" + guestsNames + ", presents=" + presents
				+ "]";
	}
}
