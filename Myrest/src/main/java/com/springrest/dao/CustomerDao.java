package com.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.model.*;

@Repository
public interface CustomerDao extends JpaRepository<Customer,String>{

}
