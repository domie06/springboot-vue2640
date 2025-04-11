package com.dao;

import com.entity.XueshengzizhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengzizhuView;

/**
 * 资助记录 Dao 接口
 *
 * @author 
 */
public interface XueshengzizhuDao extends BaseMapper<XueshengzizhuEntity> {

   List<XueshengzizhuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
