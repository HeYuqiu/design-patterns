package com.hyq.adapter.processor;

import com.hyq.adapter.domain.RatePlanRequest;
import com.hyq.adapter.domain.RatePlanResponse;

/**
 * Created by heyuqiu on 2018/12/27.
 */
public interface RatePlanProcessor {
    RatePlanResponse process(RatePlanRequest request, RatePlanResponse response);
}
