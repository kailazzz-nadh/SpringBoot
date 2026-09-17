package com.example.work.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.work.Models.MobilePhone;


public interface PhoneRepository extends CrudRepository<MobilePhone,Integer> {
	@Query("SELECT p.phonename,p.price FROM MobilePhone p")
	List<Object[]> findNamesAndPrices();
	@Query("SELECT p from MobilePhone p WHERE p.price<20000")
	List<MobilePhone> findByMaxPrice();
	@Query("SELECT p.type, COUNT(p) FROM MobilePhone p GROUP BY p.type")
	List<Object[]> findPhoneCountByType();

}
