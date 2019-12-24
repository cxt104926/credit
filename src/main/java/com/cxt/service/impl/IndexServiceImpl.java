package com.cxt.service.impl;

import java.util.List;

import com.cxt.mapper.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxt.mapper.IndexDao;
import com.cxt.model.IndexModel;
import com.cxt.service.IndexService;

/**   
* @version 2019年12月23日 下午5:12:27 
*/
@Service
public class IndexServiceImpl implements IndexService
{
    @Autowired
   IndexDao dao;

    /**
     * 查询首页展示的数据
     */
    @Override
    public List<IndexModel> findIndex_licenses()
    {
       return dao.findIndex_licenses();
    }
    
}
