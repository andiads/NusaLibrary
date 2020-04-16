package com.Library.mahasiswa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MahasiswaService {
	
	// add list
	// edited by: Muhamad Sholihin
	@Autowired
	private MahasiswaRepository repo;
	
	public List<Mahasiswa> listAll() {
        return repo.findAll();
    }

}
