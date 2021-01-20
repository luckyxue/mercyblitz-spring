package com.zhss.c2c.social.govern.report.service;

import com.zhss.c2c.social.govern.report.domain.ReportTaskVote;

import java.util.List;

/**
 * 举报任务投票Service接口
 */
public interface ReportTaskVoteService {

    /**
     * 初始化评审员对举报任务的投票
     * @param reviewerIds 评审员id
     * @param reportTaskId 举报任务id
     */
    void initVotes(List<Long> reviewerIds, Long reportTaskId);

}
