package com.restfull.serviceupload.fileupload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoliteController {
	
	private static final String template = "Greetings, %s!";

	@RequestMapping("/greeting")
	public Salutations greeting(@RequestParam(value="name", defaultValue="Human Being") String name) {
        return new Salutations(String.format(template, name));
}
}
