package com.kh.practice.set.model.vo;

import java.util.Objects;

public class Lottery {

	private String name;
	private String Phone;
	
	public Lottery() {
		
	}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		Phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Lottery [name=" + name + ", Phone=" + Phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Phone, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(Phone, other.Phone) && Objects.equals(name, other.name);
	}
	
	
}
