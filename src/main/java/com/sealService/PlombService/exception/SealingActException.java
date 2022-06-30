package com.sealService.PlombService.exception;

public class SealingActException extends RuntimeException {
    public SealingActException(String code){
        super("SealingAct not found");
    }
}
