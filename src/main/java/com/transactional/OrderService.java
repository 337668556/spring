package com.transactional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    //事务的传播性
    @Transactional(propagation=Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED)
    public boolean addOrder(){
        return true;
    }
}
