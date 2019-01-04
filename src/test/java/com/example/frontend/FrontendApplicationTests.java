package com.example.frontend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FrontendApplicationTests {
	
	// @Value("${server.port}")
	// private int port;
	
	// @Value("${management.server.port}")
	// private int mgt;
	
	// @Value("${management.server.address}")
	// private int address;
	
	// @Autowired
	// private TestRestTemplate testRestTemplate;
	
    @Test
    public void contextLoads() { 
		// @SuppressWarnings("rawtypes")
		// ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
		// "http://" + address + ":" + port + "/hello", Map.class);
    }

}
