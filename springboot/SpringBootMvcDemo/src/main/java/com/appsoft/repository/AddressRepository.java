package com.appsoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appsoft.models.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
