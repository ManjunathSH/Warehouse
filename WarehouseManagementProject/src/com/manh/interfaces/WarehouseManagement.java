package com.manh.interfaces;

import com.manh.warehouse.Warehouse;

public interface WarehouseManagement {
	boolean addWarehouse(Warehouse warehouseId);
	boolean deleteWarehouse(int warehouseId);
	boolean searchWarehouse(int warehouseId);
}
