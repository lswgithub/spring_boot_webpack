package com.example.frontend;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.BDDAssertions.then;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrontendApplicationTests {
	
	@Value("${server.port}")
	private int port;
	
	@Value("${management.server.port}")
	private int mgt;
	
	@Value("${management.server.address}")
	private int address;
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
    @Test
    public void contextLoads() { 
		@SuppressWarnings("rawtypes")
		ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
		"http://" + address + ":" + port + "/hello", Map.class);
		then(entity.getStatusCode()).isEqualTo(HttpStatus.OK); 
		
    }

}
