package com.github.karahiyo.hanoi.picker_client;

public class PickerClientSample {

	public static void main(String[] args) {
		PickerClient client = new PickerClient();
		client.setHost("localhost");
		client.setPORT(9999);
		client.send("てすてす");
	}
}