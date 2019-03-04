package com.ccbcfx.learn.message;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: 陆志庆
 * @CreateDate: 2019/3/4 16:16
 */
public class StaffLeaveMessage implements Serializable {
    private int id;
    private String name;
    private Date leaveTime;
    private String leaveReason;

    public StaffLeaveMessage(int id, String name, Date leaveTime, String leaveReason) {
        this.id = id;
        this.name = name;
        this.leaveTime = leaveTime;
        this.leaveReason = leaveReason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    @Override
    public String toString() {
        return "StaffLeaveMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leaveTime=" + leaveTime +
                ", leaveReason='" + leaveReason + '\'' +
                '}';
    }
}
