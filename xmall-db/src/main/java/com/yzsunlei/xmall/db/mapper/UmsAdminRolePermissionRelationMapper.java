package com.yzsunlei.xmall.db.mapper;

import com.yzsunlei.xmall.db.model.UmsAdminRolePermissionRelation;
import com.yzsunlei.xmall.db.model.UmsAdminRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsAdminRolePermissionRelationMapper {
    long countByExample(UmsAdminRolePermissionRelationExample example);

    int deleteByExample(UmsAdminRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRolePermissionRelation row);

    int insertSelective(UmsAdminRolePermissionRelation row);

    List<UmsAdminRolePermissionRelation> selectByExample(UmsAdminRolePermissionRelationExample example);

    UmsAdminRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UmsAdminRolePermissionRelation row, @Param("example") UmsAdminRolePermissionRelationExample example);

    int updateByExample(@Param("row") UmsAdminRolePermissionRelation row, @Param("example") UmsAdminRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(UmsAdminRolePermissionRelation row);

    int updateByPrimaryKey(UmsAdminRolePermissionRelation row);
}