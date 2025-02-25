package com.yzsunlei.xmall.admin.controller;

import com.yzsunlei.xmall.admin.dto.CommonResult;
import com.yzsunlei.xmall.admin.service.UmsMemberLevelService;
import com.yzsunlei.xmall.db.model.UmsMemberLevel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员等级管理Controller
 * Created by macro on 2018/4/26.
 */
@RestController
@Api(tags = "UmsMemberLevelController",description = "会员等级管理")
@RequestMapping("/memberLevel")
public class UmsMemberLevelController {
    @Autowired
    private UmsMemberLevelService memberLevelService;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ApiOperation("查询所有会员等级")
    @ResponseBody
    public Object list(@RequestParam("defaultStatus") Integer defaultStatus){
        List<UmsMemberLevel> memberLevelList = memberLevelService.list(defaultStatus);
        return new CommonResult().success(memberLevelList);
    }
}
