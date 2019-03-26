package com.example.frontend;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.service.*;

import com.entity.*;
//import com.service.*;


@Controller
public class FrontendController {
    
	// @Autowired
	// private COMTCCMMNCODERepository comtccmmncodeRepository;
	
	// @Autowired
	// private UserRepository userRepository;
	private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private COMTCCMMNCODERepository comtccmmncodeRepository;

	@RequestMapping("/comtccmmncode")
	// @ResponseBody
	public String findAllComtccmmncode(Model model)
	{
		List<COMTCCMMNCODE> returnList = comtccmmncodeRepository.findAll();
		model.addAttribute("returnList", returnList);
		return "/common_code";
	}
	
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
	
	// @RequestMapping(path="/all")
	// public @ResponseBody Iterable<User> getAllUsers() {
	// 	// This returns a JSON or XML with the users
	// 	return userRepository.findAll();
	// }
	
	// @RequestMapping("/returnCode")
	// @ResponseBody
	// public Iterable<COMTCCMMNCODE> returnCode() {
	// 	return comtccmmncodeRepository.findAll(); 
		
	// }
}