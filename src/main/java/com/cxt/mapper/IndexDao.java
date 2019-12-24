package com.cxt.mapper;
/**   
* @version 2019年12月23日 下午4:40:06 
*/

import java.util.List;

import com.cxt.model.IndexModel;


public interface IndexDao
{
    List<IndexModel> findIndex_licenses();
}
