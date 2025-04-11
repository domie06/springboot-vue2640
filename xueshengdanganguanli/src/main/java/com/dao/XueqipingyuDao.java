package com.dao;

import com.entity.XueqipingyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueqipingyuView;

/**
 * 学期评语 Dao 接口
 *
 * @author 
 */
public interface XueqipingyuDao extends BaseMapper<XueqipingyuEntity> {

   List<XueqipingyuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
