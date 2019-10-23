package red.silence.learn.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

	@ResponseBody
	@RequestMapping("/hello")
	public Object hello() {
		return "ok";
	}
	
	@RequestMapping("/index")
	public String indexFtl() {
		
		return "index";
	}
}
