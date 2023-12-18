package com.hb.demo.task;

import com.hb.demo.mapper.userMapper;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Component

public class AssetsTask {
    private static Logger logger = LoggerFactory.getLogger(AssetsTask.class);

    @Resource
    private com.hb.demo.mapper.userMapper userMapper;

    @XxlJob("testJobHandler")
    public void demoJobHandler() throws Exception{
        String jobParam = XxlJobHelper.getJobParam();
        XxlJobHelper.log("XXL_JOB,run successfully.");
        System.out.println("XXL_JOB,Hello WOrld." + LocalDateTime.now()+"xxljob传递的参数为："+ jobParam);
    }

    @XxlJob("testAlterTable")
    public void alterTable() throws Exception{
        userMapper.alterTable();
        logger.info("删除user表userid列成功");
    }

}
