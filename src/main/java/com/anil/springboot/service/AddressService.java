package com.anil.springboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.springboot.model.Address;

@Repository
public interface AddressService extends JpaRepository<Address, Integer> {

}
