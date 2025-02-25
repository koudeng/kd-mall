package com.yzsunlei.xmall.admin.controller;

import com.yzsunlei.xmall.admin.dto.CommonResult;
import com.yzsunlei.xmall.admin.dto.UmsPermissionNode;
import com.yzsunlei.xmall.admin.service.UmsPermissionService;
import com.yzsunlei.xmall.db.model.UmsPermission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 后台用户权限管理
 * Created by macro on 2018/9/29.
 */
@RestController
@Api(tags = "UmsPermissionController", description = "后台用户权限管理")
@RequestMapping("/permission")
public class UmsPermissionController {
    @Autowired
    private UmsPermissionService permissionService;
    @ApiOperation("添加权限")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody UmsPermission permission) {
        int count = permissionService.create(permission);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改权限")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable Long id, @RequestBody UmsPermission permission) {
        int count = permissionService.update(id,permission);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("根据id批量删除权限")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = permissionService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("以层级结构返回所有权限")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    @ResponseBody
    public Object treeList() {
        List<UmsPermissionNode> permissionNodeList = permissionService.treeList();
        return new CommonResult().success(permissionNodeList);
    }

    @ApiOperation("获取所有权限列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list() {
        List<UmsPermission> permissionList = permissionService.list();
        return new CommonResult().success(permissionList);
    }
}
