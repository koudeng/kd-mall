package com.yzsunlei.xmall.admin.controller;


import com.yzsunlei.xmall.admin.dto.CommonResult;
import com.yzsunlei.xmall.admin.dto.OssCallbackResult;
import com.yzsunlei.xmall.admin.dto.OssPolicyResult;
import com.yzsunlei.xmall.admin.service.impl.OssServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss相关操作接口
 * Created by macro on 2018/4/26.
 */
@RestController
@Api(tags = "OssController",description = "Oss管理")
@RequestMapping("/aliyun/oss")
public class OssController {
	@Autowired
	private OssServiceImpl ossService;

	@ApiOperation(value = "oss上传签名生成")
	@RequestMapping(value = "/policy",method = RequestMethod.GET)
	@ResponseBody
	public Object policy() {
		OssPolicyResult result = ossService.policy();
		return new CommonResult().success(result);
	}

	@ApiOperation(value = "oss上传成功回调")
	@RequestMapping(value = "callback",method = RequestMethod.POST)
	@ResponseBody
	public Object callback(HttpServletRequest request) {
		OssCallbackResult ossCallbackResult = ossService.callback(request);
		return new CommonResult().success(ossCallbackResult);
	}

}
