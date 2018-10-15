package com.jd.shop.pruserapp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
@Api(description = "用户配置资源的API服务")
public class UserConfigController {

    /**
     * @Description: 用户jenkins测试
     * @author xingzhiyan
     * @date 2018年10月14日 上午11:39:48
     */
    @ApiOperation(value = "用户测试jenkins构建", notes = "测试jenkins构建")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "id",required = true,dataType = "String"),
            @ApiImplicitParam(name = "Accept", value = "接收属性", required = true, dataType = "String", paramType = "header", defaultValue = "application/json"),
            @ApiImplicitParam(name = "Accept-Charset", value = "接收字符集", required = true, dataType = "String", paramType = "header", defaultValue = "utf-8"),
            @ApiImplicitParam(name = "Content-Type", value = "内容类型", required = true, dataType = "String", paramType = "header", defaultValue = "application/json; charset=UTF-8")
    })
    @RequestMapping(value = "/userInfor/{id}", method = RequestMethod.GET)
    public String userJenkinstest(@PathVariable(name="id")String id) {
        System.out.println("测试jenkins构建");
        return "测试jenkins构建,接收到的id为"+id;
    }
}
