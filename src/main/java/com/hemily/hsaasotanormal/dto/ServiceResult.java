package com.hemily.hsaasotanormal.dto;

/**
 * 业务逻辑统一响应结果
 */
public class ServiceResult {
    /**
     * 执行结果
     */
    public boolean flag;

    /**
     * 描述信息
     */
    public String msg;

    /**
     * 日志内容
     */
    public String log;

    /**
     * 执行成功
     *
     * @param _log 操作日志
     * @return
     */
    public static ServiceResult success(String _log) {
        return new ServiceResult(true, "业务逻辑执行成功", _log);
    }

    /**
     * 执行失败
     *
     * @param _msg 失败原因
     * @param _log 操作日志
     * @return
     */
    public static ServiceResult fail(String _msg, String _log) {
        return new ServiceResult(false, _msg, _log);
    }

    public ServiceResult(boolean flag, String msg, String log) {
        this.flag = flag;
        this.msg = msg;
        this.log = log;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "ServiceResult{" +
                "flag=" + flag +
                ", msg='" + msg + '\'' +
                '}';
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
