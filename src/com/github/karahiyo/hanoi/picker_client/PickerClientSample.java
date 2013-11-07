package com.github.karahiyo.hanoi.picker_client;


public class PickerClientSample {

	public static void main(String[] args) {
		PickerClient client = new PickerClient();
		client.setHost(args[0]);
		client.setPORT(9999);
		for(int i=0; i<1000; i++) {
			client.send("てすてす" + (int)(i*Math.random()*100%7));
		}
	}
}