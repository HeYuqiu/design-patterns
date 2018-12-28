package com.hyq.strategy.service;

import com.hyq.strategy.domain.ServiceType;

/**
 * Created by heyuqiu on 2018/12/28.
 */
public class ServiceBeanFactory {
    public static BaseService getServiceBean(ServiceType serviceType) {
        switch (serviceType) {
            case RATEPLAN:
                return new RatePlanService();
            case REFERPRICE:
                return new ReferPriceService();
        }
        throw new RuntimeException("serviceType error");
    }
}
