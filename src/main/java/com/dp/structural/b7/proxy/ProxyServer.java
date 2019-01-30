package com.dp.structural.b7.proxy;

public class ProxyServer implements Server {

	private RealServer realServer;
	private boolean sessionActive;

	public ProxyServer() {
		realServer = new RealServer();
	}

	@Override
	public void authenticate() {
		realServer.authenticate();
		sessionActive = true;
	}

	@Override
	public void get() {
		if (sessionActive) {
			realServer.get();
		} else {
			System.out.println("Invalid Session!");
		}
	}

	@Override
	public void post() {
		if (sessionActive) {
			realServer.post();
		} else {
			System.out.println("Invalid Session!");
		}
	}

	@Override
	public void logout() {
		realServer.logout();
		sessionActive = false;
	}

}
