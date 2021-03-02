package com.example.demokku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demokku.entity.BoardEntity;
import com.example.demokku.repository.BoardsRepository;

@RestController
@RequestMapping("/api/board/")
public class BoardController {
	

	@Autowired
	BoardsRepository boardsRepository;
	
	@RequestMapping("/list")
	public ResponseEntity<Page<BoardEntity>> getList(final Pageable pageable) {
		Page<BoardEntity> result = boardsRepository.findAll(pageable);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
