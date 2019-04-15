package com.example.demo;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.MobileModel;



@Repository
public interface MobileRepository extends JpaRepository<MobileModel, Long>{


}
