package com.hyq.adapter.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Created by heyuqiu on 2018/12/27.
 */
@Data
@AllArgsConstructor
public class RatePlanResponse {
    private List<RatePlan> ratePlanList;

    @Data
    @AllArgsConstructor
    public static class RatePlan {
        private String rateCode;
        private String breakfast;
        private String tax;

        // ...
    }
}
