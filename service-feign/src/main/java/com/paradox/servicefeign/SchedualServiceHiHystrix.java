package com.paradox.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author zhoushikang
 * @since 2021/4/13
 */
@Component
public class SchedualServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
