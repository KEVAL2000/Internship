package com.java.customercrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Long id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String mobileNumber;
	private String email;

}