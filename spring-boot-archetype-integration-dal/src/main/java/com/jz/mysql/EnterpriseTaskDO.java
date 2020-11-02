package com.jz.mysql;

import java.sql.Timestamp;

/**
 * 任务对象
 * @author
 * @date 2019年6月18日 下午7:15:23
 */
public class EnterpriseTaskDO{

    private static final long serialVersionUID = 7496383880958614795L;

    private Long id; 
    
    private  String taskId; 
    
    private String taskType; 
    
    private String taskClassName;
    
    private String status; 
    
    private String errorCode;
    
    private String errorMessage;
    
    private String retryStatus;
    
    private int  times;
    
    private Timestamp updateTime;
    
    private Timestamp createTime;
    
    private Timestamp nextExecuteTime;
    
    private String  requestAdditionalInfo;
    
    private String resultAdditionalInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskClassName() {
        return taskClassName;
    }

    public void setTaskClassName(String taskClassName) {
        this.taskClassName = taskClassName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getRetryStatus() {
        return retryStatus;
    }

    public void setRetryStatus(String retryStatus) {
        this.retryStatus = retryStatus;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(Timestamp nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    public String getRequestAdditionalInfo() {
        return requestAdditionalInfo;
    }

    public void setRequestAdditionalInfo(String requestAdditionalInfo) {
        this.requestAdditionalInfo = requestAdditionalInfo;
    }

    public String getResultAdditionalInfo() {
        return resultAdditionalInfo;
    }

    public void setResultAdditionalInfo(String resultAdditionalInfo) {
        this.resultAdditionalInfo = resultAdditionalInfo;
    }
    
    
}
