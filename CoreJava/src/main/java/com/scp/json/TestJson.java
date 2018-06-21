package com.scp.json;

import com.google.gson.Gson;

public class TestJson {
	public static void main(String[] args) {
		//JSON TO STRING 
		String json = "{ 'id': 1,'name':'John', 'email':'john.doe@gmail.com','age':29, 'phone':5168161922, 'city':'NewYork', 'hasCreditCard':false }";

		Gson gson = new Gson();

		UserDetails user = gson.fromJson(json, UserDetails.class);
		System.out.println(user);

	}
}

class UserDetails {
	private String name;
	private String email;
	private int age;
	private long phone;
	private String city;
	private boolean hasCreditCard;
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + ", city=" + city
				+ ", hasCreditCard=" + hasCreditCard + "]";
	}
	
}