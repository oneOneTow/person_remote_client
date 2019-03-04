package com.ccbcfx.learn.remote.dto;

import com.ccbcfx.learn.enums.DocumentType;
import com.ccbcfx.learn.enums.GenderType;
import com.ccbcfx.learn.enums.StaffStatusType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StaffDto {
    private Integer id;
    private String name;
    private LocalDate birthday;
    private String phone;
    private GenderType gender;
    private String imgUrl;
    private DocumentType documentType;
    private String documentNumber;
    private StaffStatusType status;
    private Integer createBy;
    private LocalDateTime createAt;
    private Integer updateBy;
    private LocalDateTime updateAt;
    private Integer deleteBy;
    private LocalDateTime deleteAt;
}
