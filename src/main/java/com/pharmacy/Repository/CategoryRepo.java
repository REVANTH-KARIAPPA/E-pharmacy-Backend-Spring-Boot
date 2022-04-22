package com.pharmacy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharmacy.model.Category;



public interface CategoryRepo  extends JpaRepository<Category, Long> {

}