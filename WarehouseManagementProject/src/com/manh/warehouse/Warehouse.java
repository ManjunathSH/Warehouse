package com.manh.warehouse;

public class Warehouse {
	private int warehouseId;
	private String warehouseLocation;
	private String warehouseCity;
	public Warehouse(int warehouseId, String warehouseLocation, String warehouseCity) {
		super();
		this.warehouseId = warehouseId;
		this.warehouseLocation = warehouseLocation;
		this.warehouseCity = warehouseCity;
	}
	public int getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getWarehouseLocation() {
		return warehouseLocation;
	}
	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}
	public String getWarehouseCity() {
		return warehouseCity;
	}
	public void setWarehouseCity(String warehouseCity) {
		this.warehouseCity = warehouseCity;
	}
	@Override
	public String toString() {
		return "Warehouse [warehouseId=" + warehouseId + ", warehouseLocation=" + warehouseLocation + ", warehouseCity="
				+ warehouseCity + "]";
	}
	
}
