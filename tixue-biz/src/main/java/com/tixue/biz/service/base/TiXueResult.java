package com.tixue.biz.service.base;

import java.io.Serializable;

/**
 * @Author: T-XUE
 * @Date: Created in 16:42 2018/1/15 0015
 * @Description:
 * @Version: 1.0
 * @Email: t_xue@foxmail.com
 * @History: <li>Author: T-XUE</li> <li>Date: 2018-01-15</li> <li>Version: 1.0</li>
 * <li>Content: create</li>
 */
public class TiXueResult implements Serializable {
    private static final long serialVersionUID = 4165926587298446217L;

    /**
     * 成功状态
     */
    private boolean success = false;

    /**
     * 结果描述
     */
    private String message = "";

    /**
     * @return
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * @return
     */
    public boolean isExecuted() {
        return false;
    }

    /**
     * @return Returns the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @param success The success to set.
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "TiXueResult [success=" + success + ", message=" + message + "]";
    }
}
