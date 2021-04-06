package sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {
	
	@RequestMapping("/exam/test1")
	public String test1() {
		return "exam test1 page";
	}
	
	@RequestMapping("/exam/test2")
	public String test2() {
		return "exam test2 page";
	}
	
	@RequestMapping("/exam/test3")
	public String test3() {
		return "exam test3 page";
	}
}
