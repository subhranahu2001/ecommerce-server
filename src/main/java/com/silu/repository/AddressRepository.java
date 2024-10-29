package com.silu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silu.modal.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
