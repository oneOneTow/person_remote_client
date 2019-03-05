package com.ccbcfx.learn.remote.client;


import com.ccbcfx.learn.remote.dto.ConditionsDTO;
import com.ccbcfx.learn.remote.dto.PageStaffDTO;
import com.ccbcfx.learn.remote.dto.StaffDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@FeignClient("server-person")
public interface StaffService {
    /**
     * 插入数据
     *
     * @param staff
     * @return
     */
    @RequestMapping(value = "/staff", method = RequestMethod.POST)
    int createStaff(@RequestBody StaffDTO staff);

    /**
     * 删除数据根据id
     *
     * @param id
     * @param deleteBy
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
    @PutMapping(path = "/staff/{id}")
    boolean updateStaff(@PathVariable(value = "id") int id,
                         @RequestBody StaffDTO staffDto);

    /**
     * 上传头像
     *
     * @param id
     * @param imgUrl
     * @return
     */
    @RequestMapping(path = "/staff/profile/{id}",
            method = RequestMethod.PUT)
    boolean updateStaffPortrait(@PathVariable(value = "id") int id,
                                @RequestParam(value = "imgUrl") String imgUrl);

    /**
     * 根据id获取用户信息
     *
     * @return StaffDto
     */
    @GetMapping(path = "/staff/{id}")
    StaffDTO getStaff(@PathVariable(value = "id") int id);

    /**
     * 根据条件查询数据
     *
     * @param conditionsDto
     * @param offset
     * @param size
     * @return
     */
    @PostMapping(path = "/staff/search")
    PageStaffDTO getStaffs(@RequestBody ConditionsDTO conditionsDto,
                             @RequestParam(value = "offset") int offset,
                             @RequestParam(value = "size") int size);

    /**
     * 批量查询数据
     *
     * @param offset
     * @param size
     * @return
     */
    @GetMapping(path = "/staff/list")
    PageStaffDTO getStaffList(@RequestParam(value = "offset") int offset,
                              @RequestParam(value = "size") int size);

    /**
     * 员工离职
     *
     * @param id
     * @param name
     * @param leaveTime
     * @param leaveReason
     * @return
     */
    @PutMapping(path = "/staff/leave/{id}")
    boolean leave(@PathVariable(value = "id") int id,
                  @RequestParam(value = "name") String name,
                  @RequestParam(value = "leaveTime") Date leaveTime,
                  @RequestParam(value = "leaveReason") String leaveReason);

}
