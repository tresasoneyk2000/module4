package com.example.demo.awsrepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.awsresource.Product;
@Repository
public interface ProductRepository extends JpaRepository <Product,Long> {

}
