package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public int plus(int n1, int n2) {
		System.out.println("plus");
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);
		
		int result = n1 + n2;
		System.out.println("result=" + result);
		return result;
	}
	
	public void outOfBounds() {
		System.out.println("outOfBounds");
		int a[] = {2, 3};
		int b = a[3] + 1;
	}
}
