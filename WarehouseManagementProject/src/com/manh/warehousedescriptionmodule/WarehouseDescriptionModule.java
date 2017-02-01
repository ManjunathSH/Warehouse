package com.manh.warehousedescriptionmodule;

public class WarehouseDescriptionModule {
	private int warehouseId;
	private String zone;
	private int aisle;
	private int bay;
	private String level;
	private int bin;
	
	public WarehouseDescriptionModule(int warehouseId, String zone, int aisle, int bay, String level, int bin) {
		super();
		this.warehouseId = warehouseId;
		this.zone = zone;
		this.aisle = aisle;
		this.bay = bay;
		this.level = level;
		this.bin = bin;
	}

	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}



	public int getAisle() {
		return aisle;
	}

	public void setAisle() {
		this.aisle = 10;
	}

	public int getBay() {
		return bay;
	}

	public void setBay() {
		this.bay = 10;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getBin() {
		return bin;
	}

	public void setBin() {
		this.bin = 2;
	}

	@Override
	public String toString() {
		return "WarehouseDescriptionModule [warehouseId=" + warehouseId + ", zone=" + zone + ", aisle=" + aisle
				+ ", bay=" + bay + ", level=" + level + ", bin=" + bin + "]";
	}
	
}
