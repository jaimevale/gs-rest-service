package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
public class CollatzController {
	
	@GetMapping("/longitud-collatz")
	public int collatzLength(@RequestParam(value="value", defaultValue = "5") int value) {
		if(value<1) return 0;
		return length(value);
	}


	int collatz(int x){
		if(x%2==0) return x/2;
		return 3*x+1;
	}

	private int length(int n){
		System.out.print(" "+n);
		return 7;
		// implementar un método recursivo que entregue la longitud de collatz
	}
}
