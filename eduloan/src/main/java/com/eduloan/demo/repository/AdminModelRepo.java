package com.eduloan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eduloan.demo.model.AdminModel;
@Repository
public interface AdminModelRepo extends JpaRepository<AdminModel,String>{

}