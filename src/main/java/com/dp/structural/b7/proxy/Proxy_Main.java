package com.dp.structural.b7.proxy;

public class Proxy_Main {

	public static void main(String[] args) {
		Server proxy = new ProxyServer();
		proxy.authenticate();
		proxy.get();
		proxy.post();
		proxy.logout();
	}

}
