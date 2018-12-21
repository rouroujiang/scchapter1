package com.wh.sericefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wanghan
 * @date 2018/12/13 9:36
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {
        @RequestMapping(value = "/hi", method = RequestMethod.GET)
        String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
