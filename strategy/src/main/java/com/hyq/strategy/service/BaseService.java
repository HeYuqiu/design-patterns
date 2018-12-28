package com.hyq.strategy.service;

import com.hyq.strategy.domain.BaseRequest;
import com.hyq.strategy.domain.BaseResponse;

/**
 * Created by heyuqiu on 2018/12/28.
 */
@FunctionalInterface
public interface BaseService {
    BaseResponse dispose(BaseRequest request);
}
