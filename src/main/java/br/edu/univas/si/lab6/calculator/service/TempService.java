package br.edu.univas.si.lab6.calculator.service;

public class TempService {
	
	public static Float getIndex(Float celsius){
		Float c = (float) 32;
		Float c2 = (float) 1.8;
		return celsius * c2 + c;
	}

}
