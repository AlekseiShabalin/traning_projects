package ru.ashabalin.models;

/**
 * Created by Aleksei Shabalin.
 */

public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}