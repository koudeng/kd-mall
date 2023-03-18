package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsAdminRole;
import com.yzsunlei.xmall.db.model.UmsAdminRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRoleMapper {
    long countByExample(UmsAdminRoleExample example);

    int deleteByExample(UmsAdminRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRole row);

    int insertSelective(UmsAdminRole row);

    List<UmsAdminRole> selectByExample(UmsAdminRoleExample example);

    UmsAdminRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsAdminRole row, @Param("example") UmsAdminRoleExample example);

    int updateByExample(@Param("row") UmsAdminRole row, @Param("example") UmsAdminRoleExample example);

    int updateByPrimaryKeySelective(UmsAdminRole row);

    int updateByPrimaryKey(UmsAdminRole row);
}