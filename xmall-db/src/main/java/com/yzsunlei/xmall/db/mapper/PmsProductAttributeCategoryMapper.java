package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.PmsProductAttributeCategory;
import com.yzsunlei.xmall.db.model.PmsProductAttributeCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeCategoryMapper {
    long countByExample(PmsProductAttributeCategoryExample example);

    int deleteByExample(PmsProductAttributeCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory row);

    int insertSelective(PmsProductAttributeCategory row);

    List<PmsProductAttributeCategory> selectByExample(PmsProductAttributeCategoryExample example);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductAttributeCategory row, @Param("example") PmsProductAttributeCategoryExample example);

    int updateByExample(@Param("row") PmsProductAttributeCategory row, @Param("example") PmsProductAttributeCategoryExample example);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory row);

    int updateByPrimaryKey(PmsProductAttributeCategory row);
}