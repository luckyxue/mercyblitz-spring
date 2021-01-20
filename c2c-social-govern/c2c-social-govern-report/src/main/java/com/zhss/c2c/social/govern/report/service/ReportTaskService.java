package com.zhss.c2c.social.govern.report.service;

import com.zhss.c2c.social.govern.report.domain.ReportTask;

/**
 * 举报任务Service接口
 */
public interface ReportTaskService {

    /**
     * 增加举报任务
     * @param reportTask 举报任务
     */
    void add(ReportTask reportTask);

}
