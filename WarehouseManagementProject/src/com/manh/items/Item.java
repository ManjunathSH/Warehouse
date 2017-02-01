package com.manh.items;

public class Item {
	private static idGenerator=100;
	protected int itemCode;
	protected String itemName;
	protected double itemPrice;
	protected String itemUnit;
	public Item(int itemCode, String itemName, double itemPrice, String itemUnit) {
		super();
		idGenerator++;
		this.itemCode = idGenerator;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemUnit = itemUnit;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(String itemUnit) {
		this.itemUnit = itemUnit;
	}
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemUnit="
				+ itemUnit + "]";
	}
	
}
