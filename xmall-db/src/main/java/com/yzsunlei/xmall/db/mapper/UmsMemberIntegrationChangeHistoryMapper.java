package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsMemberIntegrationChangeHistory;
import com.yzsunlei.xmall.db.model.UmsMemberIntegrationChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberIntegrationChangeHistoryMapper {
    long countByExample(UmsMemberIntegrationChangeHistoryExample example);

    int deleteByExample(UmsMemberIntegrationChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberIntegrationChangeHistory row);

    int insertSelective(UmsMemberIntegrationChangeHistory row);

    List<UmsMemberIntegrationChangeHistory> selectByExample(UmsMemberIntegrationChangeHistoryExample example);

    UmsMemberIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberIntegrationChangeHistory row, @Param("example") UmsMemberIntegrationChangeHistoryExample example);

    int updateByExample(@Param("row") UmsMemberIntegrationChangeHistory row, @Param("example") UmsMemberIntegrationChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsMemberIntegrationChangeHistory row);

    int updateByPrimaryKey(UmsMemberIntegrationChangeHistory row);
}