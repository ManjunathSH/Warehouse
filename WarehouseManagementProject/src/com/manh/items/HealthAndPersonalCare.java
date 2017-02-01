package com.manh.items;

public class HealthAndPersonalCare extends Item{
	private String subCategory;

	public HealthAndPersonalCare(int itemCode, String itemName, double itemPrice, String itemUnit, String subCategory) {
		super(itemCode, itemName, itemPrice, itemUnit);
		this.subCategory = subCategory;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public String toString() {
		return "HealthAndPersonalCare [subCategory=" + subCategory + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + ", itemUnit=" + itemUnit + "]";
	}
	
	
}
