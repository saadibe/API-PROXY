package com.bnp.apiproxy.dto;

import io.swagger.annotations.ApiModelProperty;

public class ContactDTO {
	
	@ApiModelProperty(notes="id contact")
	private Long id;
	@ApiModelProperty(notes="first name contact")
	private String firstName;
	@ApiModelProperty(notes="last name contact")
	private String lasttName;
	@ApiModelProperty(notes="email contact")
	private String email;
	@ApiModelProperty(notes="phone contact")
	private String phone;
	
	public ContactDTO(Long id, String firstName, String lasttName, String email, String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
		this.phone = phone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
