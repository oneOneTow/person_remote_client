package com.ccbcfx.learn.remote.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Author: 陆志庆
 * @CreateDate: 2019/3/5 15:47
 */
@Data
@AllArgsConstructor
public class PageStaffDTO {
    private Integer total;
    private List<StaffDTO> staffDtoList;
}
