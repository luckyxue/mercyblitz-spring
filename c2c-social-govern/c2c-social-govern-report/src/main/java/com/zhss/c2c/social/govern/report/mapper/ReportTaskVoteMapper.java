package com.zhss.c2c.social.govern.report.mapper;

import com.zhss.c2c.social.govern.report.domain.ReportTaskVote;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * 举报任务投票Mapper组件
 */
@Mapper
public interface ReportTaskVoteMapper {

    /**
     * 插入举报任务投票
     * @param reportTaskVote
     */
    @Insert("INSERT INTO report_task_vote(reviewer_id,report_task_id,vote_status) " +
            "VALUES(#{reviewerId},#{reportTaskId},#{voteStatus})")
    void insert(ReportTaskVote reportTaskVote);

}
