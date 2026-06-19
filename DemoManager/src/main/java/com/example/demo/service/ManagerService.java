package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Manager;

public interface ManagerService {

	void add(Manager m);
	List<Manager> display();
}
