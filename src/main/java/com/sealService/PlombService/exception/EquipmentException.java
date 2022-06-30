package com.sealService.PlombService.exception;

public class EquipmentException extends RuntimeException {
    public EquipmentException(String name){
        super("Equipment not found");
    }
}
