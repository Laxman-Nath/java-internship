package com.appsoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.appsoft.models.Address;
import com.appsoft.services.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addService;
	
	@GetMapping("address")
	public String getAddress() {
		return "addressaddform";
	}
	
	@PostMapping("address")
	public String postAddress(@ModelAttribute Address address,Model m) {
		if(this.addService.addAddress(address)!=null) {
			m.addAttribute("success", "Address is successfully registered!");
		}
		else {
			m.addAttribute("error","Error registering address!");
		}
		return "addressaddform";
	}
	
	@GetMapping("listaddresses")
	public String getAllAddresses(Model m) {
		List<Address> addresses=this.addService.getAddresses();
		m.addAttribute("addresses",addresses);
		return "addresseslist";
	}
	
	@GetMapping("editAddress")
	public String editAddress(Model m,@RequestParam int id) {
		m.addAttribute("address",this.addService.getAddressById(id));
		return "addeditform";
	}
	
	@PostMapping("updateAddress")
	public String saveUpdatedAddress(@ModelAttribute Address address) {
		this.addService.updateAddress(address);
		return "redirect:/listaddresses";
	}
	
	@GetMapping("deleteAddress")
	public String deleteAddress(@RequestParam int id) {
		this.addService.deleteAddress(id);
		return "redirect:/listaddresses";
	}
	
}
