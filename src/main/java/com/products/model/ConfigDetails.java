package com.products.model;

public class ConfigDetails {

	private int configId;

	private String configName;

	public ConfigDetails(int configId, String configName) {

		this.configId = configId;
		this.configName = configName;
	}

	public int getConfigId() {
		return configId;
	}

	public void setConfigId(int configId) {
		this.configId = configId;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

}
