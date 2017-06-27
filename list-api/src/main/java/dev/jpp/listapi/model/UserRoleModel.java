package dev.jpp.listapi.model;

public class UserRoleModel {
	private int id;
	private UserModel user;
	private int role;
	
	public UserRoleModel() {
		super();
	}

	public UserRoleModel(int id, UserModel user, int role) {
		super();
		this.id = id;
		this.user = user;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRoleModel [id=" + id + ", user=" + user + ", role=" + role + "]";
	}
}
