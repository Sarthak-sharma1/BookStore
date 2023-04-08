package com.bookStore.repository;

import com.bookStore.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {
}
