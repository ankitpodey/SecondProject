package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repositry.HomeDao;
import com.example.serviceI.ServiceI;

@Service
public class HomeService implements ServiceI {
	
	@Autowired
	HomeDao hd;
	
	@Override
	public void savedata(Student s) {
		hd.save(s);
	}

}
