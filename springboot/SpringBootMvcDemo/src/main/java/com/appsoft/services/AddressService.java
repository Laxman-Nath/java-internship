package com.appsoft.services;

import java.util.List;

import com.appsoft.models.Address;

public interface AddressService {
	Address addAddress(Address address);
	List<Address> getAddresses();
	Address getAddressById(int id);
	void deleteAddress(int id);
	Address updateAddress(Address address);
}
