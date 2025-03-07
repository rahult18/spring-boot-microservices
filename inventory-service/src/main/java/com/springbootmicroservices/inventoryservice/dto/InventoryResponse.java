package com.springbootmicroservices.inventoryservice.dto;

public record InventoryResponse(String skuCode, boolean isInStock) {
}
