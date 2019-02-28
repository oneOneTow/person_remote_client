package com.ccbcfx.learn.remote.client;


import com.ccbcfx.learn.remote.dto.ConditionsDto;
import com.ccbcfx.learn.remote.dto.StaffDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("server-person")
public interface StaffService {
    @RequestMapping(value = "/staff",
            method = RequestMethod.POST)
    int createStaff(@RequestBody StaffDto staff);

    @GetMapping(path = "/staff/list")
    List<StaffDto> getStaffs();

    @PostMapping(path = "/staff/list")
    List<StaffDto> getStaffs(@RequestBody ConditionsDto conditionsDto,@RequestParam int offset,@RequestParam int size);

    @GetMapping(path = "/staff/profile/{id}")
    String getProfilePath(@PathVariable(value = "id") int id);

    @DeleteMapping(path = "/staff/{id}")
    boolean delete(@PathVariable(value = "id") int id);
}
