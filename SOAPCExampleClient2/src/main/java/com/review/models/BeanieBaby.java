package com.review.models;

public class BeanieBaby {
	private int styleNumber;
	private String animal;
	private String name;
	private int year;
	private String poem;
	public BeanieBaby() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeanieBaby(int styleNumber, String animal, String name, int year, String poem) {
		super();
		this.styleNumber = styleNumber;
		this.animal = animal;
		this.name = name;
		this.year = year;
		this.poem = poem;
	}
	public int getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(int styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPoem() {
		return poem;
	}
	public void setPoem(String poem) {
		this.poem = poem;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((poem == null) ? 0 : poem.hashCode());
		result = prime * result + styleNumber;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanieBaby other = (BeanieBaby) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (poem == null) {
			if (other.poem != null)
				return false;
		} else if (!poem.equals(other.poem))
			return false;
		if (styleNumber != other.styleNumber)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BeanieBaby [styleNumber=" + styleNumber + ", animal=" + animal + ", name=" + name + ", year=" + year
				+ ", poem=" + poem + "]";
	}
}
