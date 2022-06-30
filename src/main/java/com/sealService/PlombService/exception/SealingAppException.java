package com.sealService.PlombService.exception;

public class SealingAppException extends RuntimeException {
    public SealingAppException(){
     super("SealingApp not found");
    }
}
