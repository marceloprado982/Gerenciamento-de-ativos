package com.project.Cotacoes.exceptions;

import com.project.Cotacoes.util.MessageUtils;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
