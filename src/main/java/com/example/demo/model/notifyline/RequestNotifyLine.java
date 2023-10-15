package com.example.demo.model.notifyline;

import lombok.Getter;
import lombok.Setter;


public class RequestNotifyLine {
    private String message;
    private Integer stickerPackageId;
    private Integer stickerId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStickerPackageId() {
        return stickerPackageId;
    }

    public void setStickerPackageId(Integer stickerPackageId) {
        this.stickerPackageId = stickerPackageId;
    }

    public Integer getStickerId() {
        return stickerId;
    }

    public void setStickerId(Integer stickerId) {
        this.stickerId = stickerId;
    }

    public Boolean getNotificationDisabled() {
        return notificationDisabled;
    }

    public void setNotificationDisabled(Boolean notificationDisabled) {
        this.notificationDisabled = notificationDisabled;
    }

    private Boolean notificationDisabled;
}
