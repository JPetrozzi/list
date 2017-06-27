package dev.jpp.listapi.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lst_listType")
public class ListType {
	private int id;
	private String code;
	private String description;
}
