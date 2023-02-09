package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	@Autowired
	private DemoRepository demoRepository;

	public Optional<DemoModel> saveModel(DemoModel demoModel) {
		demoRepository.save(demoModel);
		return demoRepository.findById(demoModel.getId());

	}

}
