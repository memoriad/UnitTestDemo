package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.DemoApplicationTests;

public class DemoServiceTest extends DemoApplicationTests{

	@Autowired
	private DemoService demoService;
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSuccess() {
		int n1 = 5;
		int n2 = 6;
		
		int result = this.demoService.plus(n1, n2);
		
		assertThat(result).isEqualTo(11);
	}
	
	@Test
	public void testFail() {
		this.demoService.outOfBounds();
	}

}
