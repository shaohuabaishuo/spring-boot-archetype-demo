package com.jz.controller;

import com.jz.executor.ExecutorTask;
import com.jz.executor.RetryExecutorTask;
import com.jz.mysql.executor.write.dao.ExecutorTaskMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: jingzhong
 * @time: 2020/9/29 16:31
 */
@Api(tags = "测试")
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @Resource
    private RetryExecutorTask retryExecutorTask;

    @PostMapping(value = "/test")
    @ApiOperation(value = "测试")
    public void test() {
        retryExecutorTask.execute(new EnterpriseTask("123"));
    }
}
