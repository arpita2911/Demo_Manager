package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService {

	
	@Autowired
	private ManagerRepository mr;
	
	
	@Override
	public void add(Manager m) {
		// TODO Auto-generated method stub
			mr.save(m);

	}

	@Override
	public List<Manager> display() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

}
