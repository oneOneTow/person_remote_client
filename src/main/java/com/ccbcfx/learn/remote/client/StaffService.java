package com.ccbcfx.learn.remote.client;


import com.ccbcfx.learn.tables.pojos.Staff;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("server_person")
public interface StaffService {
    @RequestMapping(value = "/staff",
            method = RequestMethod.POST)
    int createStaff(@RequestBody Staff staff);
}
