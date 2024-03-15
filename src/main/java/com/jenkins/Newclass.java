package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Newclass {
@GetMapping("/name")
public String gets() {
	return "This is my first project";
}


}
