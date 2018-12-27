package com.hyq.adapter.processor;

import com.hyq.adapter.domain.ReferPriceRequest;
import com.hyq.adapter.domain.ReferPriceResponse;

/**
 * Created by heyuqiu on 2018/12/27.
 * referprice更新，rateplan获取到也要触发ReferPrice更新
 */
public class ReferPriceUpdate {
    public void updatePrice(ReferPriceRequest request, ReferPriceResponse response) {
        System.out.println("ReferPrice价格更新完毕");
    }
}
