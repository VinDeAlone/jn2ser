package com.jn2ser.demoService.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jn2ser.demoService.entities.Demo;
import com.jn2ser.demoService.repositories.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	@Autowired
	private DemoRepository repo;

	@Override
	public Demo getDemo(int id) {
		return this.repo.findById(id).orElseThrow(()-> new RuntimeException("Demo with id : " + id + " not found"));
	}

	@Override
	public Demo createDemo(Demo demo) {
		int id = this.getLastId();
		demo.setId(id);
		return this.repo.save(demo);
	}

	@Override
	public List<Demo> getAllDemos() {
		return this.repo.findAll();
	}
	
	private int getLastId() {
		List<Demo> list = this.repo.findAll();
		return list.size();
	}

}
