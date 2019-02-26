package com.ccbcfx.learn.remote.dto;

import java.time.LocalDateTime;

public class StaffDto {
    private String        name;
    private LocalDateTime birthday;
    private String        phone;
    private Integer       gender;
    private String        imgUrl;
    private Integer       documentType;
    private String        documentNumber;
    private Integer       status;
    private String        createBy;
    private LocalDateTime createAt;
    private String        updateBy;
    private LocalDateTime updateAt;
    private String        deleteBy;
    private LocalDateTime deleteAt;

    public StaffDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public void setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
    }

    public LocalDateTime getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(LocalDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }

    @Override
    public String toString() {
        return "StaffDto{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", gender=" + gender +
                ", imgUrl='" + imgUrl + '\'' +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", status=" + status +
                ", createBy='" + createBy + '\'' +
                ", createAt=" + createAt +
                ", updateBy='" + updateBy + '\'' +
                ", updateAt=" + updateAt +
                ", deleteBy='" + deleteBy + '\'' +
                ", deleteAt=" + deleteAt +
                '}';
    }
}
