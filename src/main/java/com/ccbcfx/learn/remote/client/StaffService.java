package com.ccbcfx.learn.remote.client;


import com.ccbcfx.learn.remote.dto.ConditionsDto;
import com.ccbcfx.learn.remote.dto.StaffDto;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("server-person")
public interface StaffService {
    /**
     * 插入数据
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    int createStaff(@RequestBody StaffDto staff);

    /**
     * 获取所有数据
     *
     * @return
     */
    @GetMapping(path = "/staff/list")
    List<StaffDto> getStaffs();

    /**
     * 根据条件查询数据
     *
     * @param conditionsDto
     * @param offset
     * @param size
     * @return
     */
    @PostMapping(path = "/staff/search")
    List<StaffDto> getStaffs(@RequestBody ConditionsDto conditionsDto,
                             @RequestParam(value = "offset") int offset,
                             @RequestParam(value = "size") int size);


    /**
     * 删除数据根据id
     *
     * @param id
     * @return
     */
    @DeleteMapping(path = "/staff/{id}")
    boolean delete(@PathVariable(value = "id") int id,
                   @RequestParam(value = "deleteBy") int deleteBy);

    /**
     * 更新对象
     *
     * @param id
     * @param staffDto
     * @return
     */
    @PutMapping(path = "/Staff/{id}")
    StaffDto updateStaff(@PathVariable(value = "id") int id,
                         @RequestBody StaffDto staffDto);
}
