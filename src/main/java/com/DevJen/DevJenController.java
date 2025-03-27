package com.DevJen;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DevJenController {

	@GetMapping("/getWord/{a}")
	public String getMethodName(@PathVariable String a) {
		return a;
	}

	@GetMapping("/getName")
	public String getNameDetails() {
		return "Hi Karthik";
	}

}
