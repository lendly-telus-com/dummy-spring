package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private DemoService demoService;

	@GetMapping("/")
	public String Dummy() {
		return "Hello Dummy";
	}

	@PostMapping("/artists")
	public Optional<DemoModel> saveModel(@RequestBody DemoModel demoModel) {
		return this.demoService.saveModel(demoModel);

	}

}
