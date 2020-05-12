package com.products.model;

public class ProductInfo {

	private int id;

	private String name;

	public ProductInfo(int id, String name) {

		this.name = name;
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
