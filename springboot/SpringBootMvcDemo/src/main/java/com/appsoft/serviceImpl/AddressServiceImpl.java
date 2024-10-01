package com.appsoft.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsoft.models.Address;
import com.appsoft.repository.AddressRepository;
import com.appsoft.services.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addRepo;

	@Override
	public Address addAddress(Address address) {

		return this.addRepo.save(address);
	}

	@Override
	public List<Address> getAddresses() {

		return this.addRepo.findAll();
	}

	@Override
	public Address getAddressById(int id) {

		return this.addRepo.findById(id).get();
	}

	@Override
	public void deleteAddress(int id) {
		this.addRepo.deleteById(id);

	}

	@Override
	public Address updateAddress(Address address) {

		return this.addRepo.save(address);
	}

}
