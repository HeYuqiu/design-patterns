package com.hyq.strategy;

import com.hyq.strategy.domain.*;
import com.hyq.strategy.service.BaseService;
import com.hyq.strategy.service.ServiceBeanFactory;

/**
 * Created by heyuqiu on 2018/12/28.
 */
public class ApiRequestActor {
    private BaseService service;

    public BaseResponse receive(BaseRequest request) {
        if (request instanceof RatePlanRequest) {
            service = ServiceBeanFactory.getServiceBean(ServiceType.RATEPLAN);
        } else if (request instanceof ReferPriceRequest) {
            service = ServiceBeanFactory.getServiceBean(ServiceType.REFERPRICE);
        }
        BaseResponse response = service.dispose(request);
        return response;
    }
}
