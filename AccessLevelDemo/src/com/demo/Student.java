package com.demo;

// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student {

	/** The id. */
	private int id;
	
	/** The name. */
	private String name;
	
	/** The gender. */
	private String gender;

	/** The i gender. */
	private int iGender;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 * @author amol
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		if (gender.equals("male")) {
			iGender = 1;
		} else if (gender.equals("female")) {
			iGender = 2;
		}
		//if invalid gender
		if (iGender == 0) {
			throw new IllegalArgumentException();
		}
		this.gender = gender;
	}

}
