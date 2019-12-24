package com.cxt.controller;

import com.cxt.model.IndexModel;
import com.cxt.util.Message;
import com.cxt.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxt.service.IndexService;

import java.util.List;

/**   
* @version 2019年12月23日 下午4:31:31 
*/
@Controller
@RequestMapping("cxt")
public class IndexController
{
    @Autowired
    IndexService service;
    
    @GetMapping("/credit/department/administrative/license/find/page")
    public Message initIndex() {
        List<IndexModel> list = service.findIndex_licenses();
        return MessageUtil.success(list);
    }


}

