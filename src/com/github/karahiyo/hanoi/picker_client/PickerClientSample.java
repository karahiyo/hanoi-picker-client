package com.github.karahiyo.hanoi.picker_client;

public class PickerClientSample {

	public static void main(String[] args) throws Exception{
		PickerClient client = new PickerClient();
		for(int i=0; i<100; i++) {
			client.send("test message" + (int)(i*Math.random()*100%7));
		}
		client.socketClose();
	}
}