package com.jz.controller;

import com.jz.enums.ExecutorTaskStatusEnum;
import com.jz.executor.ExecutorTask;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/29 16:34
 */
public class EnterpriseTask implements ExecutorTask<EnterpriseResult> {
    private String requestId;

    public EnterpriseTask(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String getTaskId() {
        return requestId;
    }

    @Override
    public String getTaskType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public EnterpriseResult doExecute() {
        EnterpriseResult result = new EnterpriseResult();
        result.setStatusEnum(ExecutorTaskStatusEnum.SUCCESS);
        return result;
    }

    @Override
    public String getRequestDetail() {
        return null;
    }
}
