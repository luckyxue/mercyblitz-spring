package com.zhss.c2c.social.govern.reviewer.dao;

import com.zhss.c2c.social.govern.reviewer.domain.ReviewerTaskStatus;
import com.zhss.c2c.social.govern.reviewer.mapper.ReviewerTaskStatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * 评审员处理任务DAO组件
 */
@Repository
public class ReviewerTaskStatusDAOImpl implements ReviewerTaskStatusDAO {

    /**
     * 评审员处理任务Mapper组件
     */
    @Autowired
    private ReviewerTaskStatusMapper reviewerTaskStatusMapper;

    /**
     * 增加评审处理任务状态
     * @param reviewerTaskStatus 评审处理任务状态
     */
    public void add(ReviewerTaskStatus reviewerTaskStatus) {
        reviewerTaskStatusMapper.insert(reviewerTaskStatus);
    }

}
