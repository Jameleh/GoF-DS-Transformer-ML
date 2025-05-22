package com.genpact.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.genpact.model.OrderRequest;

public class Order {

	OrderRequest orderRequest;

	public Order(OrderRequest orderRequest) {
		super();
		this.orderRequest = orderRequest;
	}

	public OrderRequest getOrderRequest() {
		return orderRequest;
	}

	public void setOrderRequest(OrderRequest orderRequest) {
		this.orderRequest = orderRequest;
	}

	public boolean IsValid = true;


	public boolean isValid(OrderRequest orderRequest) throws IOException {
		/*
		 * call validation service and validate the order if validation is processed
		 * successfully then pass to discount handler else halt the process
		 */
		boolean isValidated = false;
		String output = "";
		URL url = new URL("http://localhost:8082/validate");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		ObjectMapper mapper = new ObjectMapper();
		String jsonstring = mapper.writeValueAsString(orderRequest);
		OutputStream os = conn.getOutputStream();
		os.write(jsonstring.getBytes());
		os.flush();

		if (conn.getResponseCode() != 200) {
			throw new RuntimeException("validation service failed : " + conn.getResponseCode());
		}

		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

		System.out.println("Validation service ran successfully .... \n");
		while ((output = br.readLine()) != null) {
			System.out.println(output);
			if (output.equals("true"))
				isValidated = true;
		}

		conn.disconnect();

		return isValidated;
		
	}

	public void ApplyDiscount() {
		// call discount service to apply discount like validation service called for validating the order request in the above method
		System.out.println("Discount Applied...");
		// Apply discount logic here
	}

	public boolean ProcessPayment() {
		// call Payment service .
		System.out.println("Payment Processed...");
		return true;
	}

	public void Ship() {
		// Shipping logic here
		System.out.println("Order Shipped...");
	}

}
