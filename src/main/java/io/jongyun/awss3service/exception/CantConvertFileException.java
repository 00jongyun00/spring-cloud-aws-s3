package io.jongyun.awss3service.exception;

import io.jongyun.awss3service.dto.error.ErrorCode;

public class CantConvertFileException extends BusinessException{
    public CantConvertFileException(){
        super(ErrorCode.CANT_CONVERT_FILE);
    }
    
}
