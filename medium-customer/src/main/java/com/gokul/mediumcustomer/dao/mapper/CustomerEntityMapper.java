package com.gokul.mediumcustomer.dao.mapper;


import com.gokul.mediumcustomer.dao.entity.CustomerEntity;
import com.gokul.mediumcustomer.service.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerEntityMapper {
    CustomerEntityMapper INSTANCE = Mappers.getMapper(CustomerEntityMapper.class);

    CustomerEntity customerToCustomerEntity(Customer customer);
    Customer customerEntityToCustomer(CustomerEntity customerEntity);
}
