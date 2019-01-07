package com.dp.structural.b1.adapter;

public class Adapter_Main {
	
	public static void main(String[] args) {
		System.out.println("======== Legacy OMS Client =======");
		legacyOMSClient();
		System.out.println("======== New OMS Client ===========");
		newOMSClient();
	}

	private static void legacyOMSClient() {
		LegacyOMS legacyOMS = new LegacyOMS();
		legacyOMS.addItem(new Item("Shirt", 500.50));
		legacyOMS.addItem(new Item("Pant", 1000.50));
		legacyOMS.makePayment(new Payment("Cash", 1500.0));
	}
	
	private static void newOMSClient() {
		//THIS CODE AS DONE WITH LEGACY IS NOT POSSIBLE. We NEED an Adapter that plugs in this client code with New OMS. 
		/*NewOMS newOMS = new NewOMS();
		newOMS.addItem(new Item("Shirt", 500.50));
		newOMS.addItem(new Item("Pant", 1000.50));
		newOMS.makePayment(new Payment("Cash", 1500.0));*/
		
		//Now using Adapter to make the above client code work.
		OMSAdapter omsAdapter = new OMSAdapter();
		omsAdapter.addItem(new Item("Shirt", 500.50));
		omsAdapter.addItem(new Item("Pant", 1000.50));
		omsAdapter.makePayment(new Payment("Cash", 1500.0));
		
	}


}
