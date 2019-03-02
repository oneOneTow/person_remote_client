package com.ccbcfx.learn.remote.dto;


import com.ccbcfx.learn.enums.DocumentType;
import com.ccbcfx.learn.enums.GenderType;
import com.ccbcfx.learn.enums.StaffStatusType;
import lombok.Data;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ConditionsDto {
    private String name;
    private LocalDate birthday;
    private DocumentType documentType;
    private String documentNumber;
    private String phone;
    private GenderType gender;
    private StaffStatusType status;
    private LocalDateTime createBegin;
    private LocalDateTime createEnd;
    private LocalDateTime updateBegin;
    private LocalDateTime updateEnd;
    private LocalDateTime deleteBegin;
    private LocalDateTime deleteEnd;
    private Boolean enabled;
}
