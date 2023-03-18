package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.PmsCommentReply;
import com.yzsunlei.xmall.db.model.PmsCommentReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsCommentReplyMapper {
    long countByExample(PmsCommentReplyExample example);

    int deleteByExample(PmsCommentReplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsCommentReply row);

    int insertSelective(PmsCommentReply row);

    List<PmsCommentReply> selectByExample(PmsCommentReplyExample example);

    PmsCommentReply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsCommentReply row, @Param("example") PmsCommentReplyExample example);

    int updateByExample(@Param("row") PmsCommentReply row, @Param("example") PmsCommentReplyExample example);

    int updateByPrimaryKeySelective(PmsCommentReply row);

    int updateByPrimaryKey(PmsCommentReply row);
}