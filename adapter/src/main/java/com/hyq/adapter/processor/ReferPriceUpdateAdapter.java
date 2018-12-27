package com.hyq.adapter.processor;

import com.hyq.adapter.domain.RatePlanRequest;
import com.hyq.adapter.domain.RatePlanResponse;
import com.hyq.adapter.domain.ReferPriceRequest;
import com.hyq.adapter.domain.ReferPriceResponse;

import java.util.Arrays;

/**
 * Created by heyuqiu on 2018/12/27.
 */
public class ReferPriceUpdateAdapter implements RatePlanProcessor {
    private ReferPriceUpdate referPriceUpdate;

    public ReferPriceUpdateAdapter() {
        referPriceUpdate = new ReferPriceUpdate();
    }

    @Override
    public RatePlanResponse process(RatePlanRequest request, RatePlanResponse response) {
        ReferPriceRequest referPriceRequest = new ReferPriceRequest(request.getHotelId());
        ReferPriceResponse referPriceResponse = new ReferPriceResponse(Arrays.asList(new ReferPriceResponse.Hotel(request.getHotelId(), response.getRatePlanList().get(0).getTax())));
        referPriceUpdate.updatePrice(referPriceRequest, referPriceResponse);
        return response;
    }
}
