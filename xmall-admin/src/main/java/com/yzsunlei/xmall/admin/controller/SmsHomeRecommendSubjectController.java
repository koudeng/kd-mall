package com.yzsunlei.xmall.admin.controller;

import com.yzsunlei.xmall.admin.dto.CommonResult;
import com.yzsunlei.xmall.admin.service.SmsHomeRecommendSubjectService;
import com.yzsunlei.xmall.db.model.SmsHomeRecommendSubject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首页专题推荐管理Controller
 * Created by macro on 2018/11/6.
 */
@RestController
@Api(tags = "SmsHomeRecommendSubjectController", description = "首页专题推荐管理")
@RequestMapping("/home/recommendSubject")
public class SmsHomeRecommendSubjectController {
    @Autowired
    private SmsHomeRecommendSubjectService recommendSubjectService;
    @ApiOperation("添加首页推荐专题")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public Object create(@RequestBody List<SmsHomeRecommendSubject> homeBrandList) {
        int count = recommendSubjectService.create(homeBrandList);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("修改推荐排序")
    @RequestMapping(value = "/update/sort/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object updateSort(@PathVariable Long id, Integer sort) {
        int count = recommendSubjectService.updateSort(id,sort);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量删除推荐")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Object delete(@RequestParam("ids") List<Long> ids) {
        int count = recommendSubjectService.delete(ids);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("批量修改推荐状态")
    @RequestMapping(value = "/update/recommendStatus", method = RequestMethod.POST)
    @ResponseBody
    public Object updateRecommendStatus(@RequestParam("ids") List<Long> ids, @RequestParam Integer recommendStatus) {
        int count = recommendSubjectService.updateRecommendStatus(ids,recommendStatus);
        if(count>0){
            return new CommonResult().success(count);
        }
        return new CommonResult().failed();
    }

    @ApiOperation("分页查询推荐")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(@RequestParam(value = "subjectName", required = false) String subjectName,
                       @RequestParam(value = "recommendStatus", required = false) Integer recommendStatus,
                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsHomeRecommendSubject> homeBrandList = recommendSubjectService.list(subjectName,recommendStatus,pageSize,pageNum);
        return new CommonResult().pageSuccess(homeBrandList);
    }
}
