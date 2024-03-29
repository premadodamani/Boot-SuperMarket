package org.jsp.super_market.controller;

import org.jsp.super_market.dto.Merchant;
import org.jsp.super_market.exception.AllException;
import org.jsp.super_market.helper.Login;
import org.jsp.super_market.helper.ResponseStructure;
import org.jsp.super_market.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("merchant")
public class MerchantController {

	@Autowired
	MerchantService service;

	@PostMapping("signup")
	public ResponseStructure<Merchant> signup(@RequestBody Merchant merchant) {
		return service.signup(merchant);
	}
	
	@PutMapping("verify/{id}/{otp}")
	public ResponseStructure<Merchant> verify(@PathVariable String id,@PathVariable int otp) throws AllException
	{
		return service.verify(id,otp);
	}
	
	@PostMapping("login")
	public ResponseStructure<Merchant> login(@RequestBody Login login) throws AllException
	{
		return service.login(login);
	}
}
