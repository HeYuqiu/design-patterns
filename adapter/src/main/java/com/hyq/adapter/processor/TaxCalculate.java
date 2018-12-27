package com.hyq.adapter.processor;

import com.hyq.adapter.domain.RatePlanRequest;
import com.hyq.adapter.domain.RatePlanResponse;

/**
 * Created by heyuqiu on 2018/12/27.
 */
public class TaxCalculate implements RatePlanProcessor {

    @Override
    public RatePlanResponse process(RatePlanRequest request, RatePlanResponse response) {
        response.getRatePlanList().forEach(ratePlan -> ratePlan.setTax("TaxCalculate 处理完成"));
        System.out.println("TaxCalculate 处理完成");
        return response;
    }
}
