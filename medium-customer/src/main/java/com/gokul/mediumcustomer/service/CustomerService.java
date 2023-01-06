package com.gokul.mediumcustomer.service;

import com.gokul.mediumcustomer.dao.CustomerDao;
import com.gokul.mediumcustomer.dao.entity.CustomerEntity;
import com.gokul.mediumcustomer.dao.mapper.CustomerEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public Customer saveCustomer(Customer customer) {
        return persistCustomer(customer);
    }

    private Customer persistCustomer(Customer customer) {
        CustomerEntity customerEntity = CustomerEntityMapper.INSTANCE.customerToCustomerEntity(customer);
        CustomerEntity storedEntity = customerDao.save(customerEntity);
        Customer returnCustomer = CustomerEntityMapper.INSTANCE.customerEntityToCustomer(storedEntity);
        return returnCustomer;
    }


}
