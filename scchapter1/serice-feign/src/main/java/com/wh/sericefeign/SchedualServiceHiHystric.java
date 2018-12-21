package com.wh.sericefeign;

import org.springframework.stereotype.Component;

/**
 * @author wanghan
 * @date 2018/12/13 10:51
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
