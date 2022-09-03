package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;


@RestController
public class CollatzController {
	
	@GetMapping("/collatz")
	public BigInteger collatzLength(@RequestParam(value="value", defaultValue = "5") BigInteger value) {
		if(value.compareTo(BigInteger.ONE)<1) return BigInteger.ZERO;
		return length(value);
	}


	BigInteger collatz(BigInteger x){
		if(x.mod(BigInteger.TWO).equals(BigInteger.ZERO)) return x.divide(BigInteger.TWO);
		return BigInteger.valueOf(3).multiply(x).add(BigInteger.ONE); //3*x+1;
	}

	private BigInteger length(BigInteger n){
		System.out.print(" "+n);
		if(BigInteger.ONE.equals(n)){
			System.out.println(".");
			return BigInteger.ONE;
		}
		return BigInteger.ONE.add(length(collatz(n)));
	}
}
