package com.revature.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bean.Laptop;

@Repository
public interface LaptopRepo extends JpaRepository<Laptop, String> {

}
