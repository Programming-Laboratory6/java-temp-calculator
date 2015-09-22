package br.edu.univas.si.lab6.calculator.service;

public class TempService {
	
	public static Float getIndex(Float celsius){
		return (float) (celsius * 32 + 1.8);
	}

}
