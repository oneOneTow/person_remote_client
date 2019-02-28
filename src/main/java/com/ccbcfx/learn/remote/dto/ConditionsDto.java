package com.ccbcfx.learn.remote.dto;


import com.ccbcfx.learn.enums.DocumentType;
import com.ccbcfx.learn.enums.GenderType;
import com.ccbcfx.learn.enums.StaffStatusType;
import lombok.Data;


import java.util.Date;

@Data
public class ConditionsDto {
    private String name;
    private Date birthday;
    private DocumentType documentType;
    private String documentNumber;
    private String phone;
    private GenderType gender;
    private StaffStatusType status;
    private Date createBegin;
    private Date createEnd;
    private Date updateBegin;
    private Date updateEnd;
    private Date deleteBengin;
    private Date deleteEnd;
    private boolean enabled;
}
