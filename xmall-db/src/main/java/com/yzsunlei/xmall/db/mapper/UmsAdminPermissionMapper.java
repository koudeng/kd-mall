package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsAdminPermission;
import com.yzsunlei.xmall.db.model.UmsAdminPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminPermissionMapper {
    long countByExample(UmsAdminPermissionExample example);

    int deleteByExample(UmsAdminPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminPermission row);

    int insertSelective(UmsAdminPermission row);

    List<UmsAdminPermission> selectByExample(UmsAdminPermissionExample example);

    UmsAdminPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsAdminPermission row, @Param("example") UmsAdminPermissionExample example);

    int updateByExample(@Param("row") UmsAdminPermission row, @Param("example") UmsAdminPermissionExample example);

    int updateByPrimaryKeySelective(UmsAdminPermission row);

    int updateByPrimaryKey(UmsAdminPermission row);
}