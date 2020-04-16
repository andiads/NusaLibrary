package com.Library.mahasiswa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mahasiswa {
	
	private Long id;
	private String name;
	private String email;
	private String fakultas;
	private String jurusan;
	private String course;
	
	protected Mahasiswa() {
		
	}

	

	public Mahasiswa(Long id, String name, String email, String fakultas, String jurusan, String course) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.fakultas = fakultas;
		this.jurusan = jurusan;
		this.course = course;
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFakultas() {
		return fakultas;
	}

	public void setFakultas(String fakultas) {
		this.fakultas = fakultas;
	}
	public String getJurusan() {
		return jurusan;
	}

	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	

}
