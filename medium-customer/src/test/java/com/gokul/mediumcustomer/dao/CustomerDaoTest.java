package com.gokul.mediumcustomer.dao;

import com.gokul.mediumcustomer.dao.entity.CustomerEntity;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;



    @Test
    public void testSaveCustomer(){
        CustomerEntity newCustomer= CustomerEntity.builder()
                .firstName("Gokul")
                .lastName("Nair")
                .email("gokulkbalachandran@gmail.com")
                .phoneNumber("729670128")
                .build();

        customerDao.save(newCustomer);

        Optional<CustomerEntity>returnedCustomer=customerDao.findById(newCustomer.getCustomerId());

        assertThat(returnedCustomer.isPresent()).isTrue();
        assertThat(returnedCustomer.get()).isEqualTo(newCustomer);
    }
}