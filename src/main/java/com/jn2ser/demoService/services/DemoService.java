package com.jn2ser.demoService.services;

import java.util.List;

import com.jn2ser.demoService.entities.Demo;

public interface DemoService {
	
	Demo getDemo(int id);
	Demo createDemo(Demo demo);
	List<Demo> getAllDemos();

}
