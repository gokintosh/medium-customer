package com.gokul.mediumcustomer.dao;


import com.gokul.mediumcustomer.dao.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<CustomerEntity, Long> {
}