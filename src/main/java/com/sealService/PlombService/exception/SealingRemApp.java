package com.sealService.PlombService.exception;

public class SealingRemApp extends RuntimeException {
    public SealingRemApp(){
        super("SealingApp not found");
    }
}
