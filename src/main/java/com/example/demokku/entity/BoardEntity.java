package com.example.demokku.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter @Setter
@Entity
@Table(name = "tb_board")
public class BoardEntity {

	@Id
	private Long boardNo;

	@Column(length = 100)
	private String boardTitle;
	
	private String boardWriter;
	
	private Long boardHit;
	
	@CreationTimestamp
	private Date regDt;
	
	@UpdateTimestamp
	private Date modDt;

	public BoardEntity() {
		super();
	}
	
	public BoardEntity(Long boardNo, String boardTitle, String boardWriter, Long boardHit, Date regDt, Date modDt) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardHit = boardHit;
		this.regDt = regDt;
		this.modDt = modDt;
	}
	
}
