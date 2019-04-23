/*
 * Copyright (c) 2001-2019 GuaHao.com Corporation Limited. All rights reserved.
 * This software is the confidential and proprietary information of GuaHao Company.
 * ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with GuaHao.com.
 */
package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.Getter;

/**
 * TODO
 *
 * @author gaoty
 * @version V1.0
 * @since 2019-03-02 14:26
 */
@Getter
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}