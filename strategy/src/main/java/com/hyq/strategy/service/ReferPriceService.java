package com.hyq.strategy.service;

import com.hyq.strategy.domain.BaseRequest;
import com.hyq.strategy.domain.BaseResponse;

/**
 * Created by heyuqiu on 2018/12/28.
 */
public class ReferPriceService implements BaseService {
    @Override
    public BaseResponse dispose(BaseRequest request) {
        System.out.println("ReferPriceService dispose !");
        return new BaseResponse();
    }
}
