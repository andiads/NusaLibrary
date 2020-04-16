package com.Library.mahasiswa;

import java.util.List;

public class MahasiswaService {
	
	// add list
	// edited by: Muhamad Sholihin
	private MahasiswaRepository repo;
	
	public List<Mahasiswa> listAll() {
        return repo.findAll();
    }

}
