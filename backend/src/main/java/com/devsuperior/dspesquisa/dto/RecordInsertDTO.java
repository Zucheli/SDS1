package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

public class RecordInsertDTO implements Serializable {
	//Serializable
	private static final long serialVersionUID = 1L;
	
	//Atributos Básicos
	private String name;
	private Integer age;
	private Long gameId;
	
	//Construtores
	public RecordInsertDTO() {
	}

	//Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long gameId) {
		this.gameId = gameId;
	}
}
