package com.manh.interfaces;

import com.manh.items.Item;
import com.manh.warehouse.Warehouse;

public interface InventoryManagement {

	boolean addItem(Item item, Warehouse warehouse);
	boolean deleteItem(int warehouseId,int itemCode);
	boolean updateItem(int itemCode,int quantity);
	boolean moveItem(int itemCode,double quantity,int initialWarehouseId,int finalWarehouseId,String zone);
	Item searchItemForLocation(int itemCode,int warehouseId);
}
