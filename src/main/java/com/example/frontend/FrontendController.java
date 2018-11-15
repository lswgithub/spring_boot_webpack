package com.example.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FrontendController {
    
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/hello")
    public String home(Model model){
        model.addAttribute("message", ".!!!!!");
        return "index";
    }
	
	@RequestMapping("/returnJson")
	@ResponseBody
	public FrontendExampleModel returnJson(@RequestParam(name="name", required=false, defaultValue ="Unknown" ) String name) {
		return new FrontendExampleModel(counter.incrementAndGet(), name); 
		
	}
}