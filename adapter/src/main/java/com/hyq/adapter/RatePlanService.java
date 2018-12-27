package com.hyq.adapter;

import com.hyq.adapter.domain.RatePlanRequest;
import com.hyq.adapter.domain.RatePlanResponse;
import com.hyq.adapter.processor.BreakfastFilter;
import com.hyq.adapter.processor.RatePlanProcessor;
import com.hyq.adapter.processor.ReferPriceUpdateAdapter;
import com.hyq.adapter.processor.TaxCalculate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by heyuqiu on 2018/12/27.
 */
public class RatePlanService {
    private List<RatePlanProcessor> processors;

    public RatePlanService() {
        processors = new ArrayList<>();
        processors.add(new BreakfastFilter());
        processors.add(new TaxCalculate());

        // XXXX-XX-XX 加需求：获取rateplan需要更新ReferPrice价格（执行ReferPriceUpdate）， 但是ReferPriceUpdate 不继承自RatePlanProcessor ，所以需要适配器
        processors.add(new ReferPriceUpdateAdapter());
    }

    /**
     * rateplan入口，传入请求， 返回结果
     * @param request
     * @return
     */
    public RatePlanResponse ratePlan(RatePlanRequest request) {
        RatePlanResponse response = new RatePlanResponse(Arrays.asList(new RatePlanResponse.RatePlan("123","two breakfast","CNY 33.51")));
        System.out.println("请求供应商接口并返回供应商结果，转成RatePlanResponse...");

        for (RatePlanProcessor processor:processors) {
            response = processor.process(request, response);
        }
        System.out.println("对得到的RatePlanResponse对应多个环节处理...");


        return response;
    }
}
