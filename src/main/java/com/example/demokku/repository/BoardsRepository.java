package com.example.demokku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demokku.entity.BoardEntity;

public interface BoardsRepository extends JpaRepository<BoardEntity, Long> {
	
}
