package com.ccbcfx.learn.remote.dto;

import com.ccbcfx.learn.enums.DocumentType;
import com.ccbcfx.learn.enums.GenderType;
import com.ccbcfx.learn.enums.StaffStatusType;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class StaffDto {
    private int id;
    private String name;
    private LocalDate birthday;
    private String phone;
    private GenderType gender;
    private String imgUrl;
    private DocumentType documentType;
    private String documentNumber;
    private StaffStatusType status;
    private String createBy;
    private LocalDateTime createAt;
    private String updateBy;
    private LocalDateTime updateAt;
    private String deleteBy;
    private LocalDateTime deleteAt;
}
