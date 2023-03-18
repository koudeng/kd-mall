package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsMemberGrowthChangeHistory;
import com.yzsunlei.xmall.db.model.UmsMemberGrowthChangeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberGrowthChangeHistoryMapper {
    long countByExample(UmsMemberGrowthChangeHistoryExample example);

    int deleteByExample(UmsMemberGrowthChangeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberGrowthChangeHistory row);

    int insertSelective(UmsMemberGrowthChangeHistory row);

    List<UmsMemberGrowthChangeHistory> selectByExample(UmsMemberGrowthChangeHistoryExample example);

    UmsMemberGrowthChangeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberGrowthChangeHistory row, @Param("example") UmsMemberGrowthChangeHistoryExample example);

    int updateByExample(@Param("row") UmsMemberGrowthChangeHistory row, @Param("example") UmsMemberGrowthChangeHistoryExample example);

    int updateByPrimaryKeySelective(UmsMemberGrowthChangeHistory row);

    int updateByPrimaryKey(UmsMemberGrowthChangeHistory row);
}