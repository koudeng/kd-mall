package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.PmsProductAttributeValue;
import com.yzsunlei.xmall.db.model.PmsProductAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductAttributeValueMapper {
    long countByExample(PmsProductAttributeValueExample example);

    int deleteByExample(PmsProductAttributeValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeValue row);

    int insertSelective(PmsProductAttributeValue row);

    List<PmsProductAttributeValue> selectByExample(PmsProductAttributeValueExample example);

    PmsProductAttributeValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductAttributeValue row, @Param("example") PmsProductAttributeValueExample example);

    int updateByExample(@Param("row") PmsProductAttributeValue row, @Param("example") PmsProductAttributeValueExample example);

    int updateByPrimaryKeySelective(PmsProductAttributeValue row);

    int updateByPrimaryKey(PmsProductAttributeValue row);
}