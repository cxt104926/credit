package com.cxt.service;
/**   
* @version 2019年12月23日 下午5:09:36 
*/

import java.util.List;

import com.cxt.model.IndexModel;

public interface IndexService
{
    List<IndexModel> findIndex_licenses();
}
