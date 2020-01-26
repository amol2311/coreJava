package com.test.model;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {

	/** The id. */
	private int id;

	/** The name. */
	private String name;

	public static User[] myUsers = new User[10];
	public static int counter = 1000;
	public static int actualUserCount=0;
	static {
		System.out.println("inside staic block to add some users");
		myUsers[0] = new User("abc");
		actualUserCount++;
	}

	public User(String name) {
		this.id = ++counter;
		this.name = name;
	}

	// add a user
	public static User addUser(User user) {
		//get a length of my user array
		//add th element at the end : length
		if (actualUserCount < myUsers.length) {
			if (user != null && !user.getName().equals("")) {
				myUsers[actualUserCount] = user;
				actualUserCount++;
				System.out.println(user);
			} else {
				System.out.println("invalid user inputs");
			}
		} else {
			System.out.println("Max users reached");
		}
		return user;
	}

	// get all users
	public static User[] getAllUsers() {
		return null;

	}

	// get a user
	public static String getUser(int userId) {
		return null;
	}

	// delete a user
	public static User[] deleteUser(int userId) {
		
		
		return null;
	}

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
	 *
	 * @param id
	 *            the new id
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
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id:" + this.id + " name:" + this.name;

	}
}
