package com.hyq.adapter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by heyuqiu on 2018/12/27.
 */
@Data
@AllArgsConstructor
public class ReferPriceResponse {

    private List<Hotel> hotelList;

    @Data
    @AllArgsConstructor
    public static class Hotel {
        private String hotelId;
        private String price;
    }
}
