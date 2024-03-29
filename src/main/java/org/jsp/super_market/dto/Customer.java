package org.jsp.super_market.dto;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
@Component
public class Customer {
	@Id
	@GeneratedValue(generator = "customerid")
	@GenericGenerator(name = "customerid", strategy = "org.jsp.super_market.helper.CustomerIdGenerator")
	String id;
	String name;
	String email;
	String password;
	long mobile;
	String address;
	boolean status;
	double wallet;
	int otp;
}
