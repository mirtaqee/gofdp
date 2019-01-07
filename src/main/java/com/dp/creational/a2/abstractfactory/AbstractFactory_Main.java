package com.dp.creational.a2.abstractfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactory_Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = br.readLine();

		System.out.print("\n");
		System.out.print("Enter the type of loan e.g. home loan or business loan or education loan : ");
		String loanName=br.readLine();  
		
		AbstractFactory bankFactory = FactoryCreator.getFactory("bank");
		Bank bank = bankFactory.getBank(bankName);
		System.out.println(bank.getBankName());
		
		AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
		Loan loan = loanFactory.getLoan(loanName);
		System.out.println(loan.getLoanName());
	}
}
