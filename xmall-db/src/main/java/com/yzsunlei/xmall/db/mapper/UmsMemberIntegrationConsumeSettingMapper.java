package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsMemberIntegrationConsumeSetting;
import com.yzsunlei.xmall.db.model.UmsMemberIntegrationConsumeSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberIntegrationConsumeSettingMapper {
    long countByExample(UmsMemberIntegrationConsumeSettingExample example);

    int deleteByExample(UmsMemberIntegrationConsumeSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberIntegrationConsumeSetting row);

    int insertSelective(UmsMemberIntegrationConsumeSetting row);

    List<UmsMemberIntegrationConsumeSetting> selectByExample(UmsMemberIntegrationConsumeSettingExample example);

    UmsMemberIntegrationConsumeSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsMemberIntegrationConsumeSetting row, @Param("example") UmsMemberIntegrationConsumeSettingExample example);

    int updateByExample(@Param("row") UmsMemberIntegrationConsumeSetting row, @Param("example") UmsMemberIntegrationConsumeSettingExample example);

    int updateByPrimaryKeySelective(UmsMemberIntegrationConsumeSetting row);

    int updateByPrimaryKey(UmsMemberIntegrationConsumeSetting row);
}