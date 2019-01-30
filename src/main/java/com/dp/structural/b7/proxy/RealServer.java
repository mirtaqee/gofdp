package com.dp.structural.b7.proxy;

public class RealServer implements Server {

	@Override
	public void authenticate() {
		System.out.println("REAL -> Authenticate");
	}

	@Override
	public void get() {
		System.out.println("REAL -> Get");
	}

	@Override
	public void post() {
		System.out.println("REAL -> Post");
	}

	@Override
	public void logout() {
		System.out.println("REAL -> Logout");
	}

}
