package com.mindex.challenge;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ChallengeApplicationTests {

    private String employeeIdUrl;

	@LocalServerPort
    private int port = 8080;

	@Before
    public void setup() {
        employeeIdUrl = "http://localhost:" + port + "/reportingStructure/{id}";
    }
	
	@Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
		String testEmployeeId = "16a596ae-edd3-4847-99fe-c4518e82c86f";
		//pass the id into a REST call to get the employee
		ResponseEntity<Integer> ReportCalculated = restTemplate.getForEntity(employeeIdUrl, Integer.class, testEmployeeId);
		assertEquals(4, ReportCalculated);
	}

}
