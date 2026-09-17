package com.example.work.Repository;
import org.springframework.data.repository.CrudRepository;
import com.example.work.Models.ProductModel;

public interface ProductRepository extends CrudRepository<ProductModel,Integer> {

}
