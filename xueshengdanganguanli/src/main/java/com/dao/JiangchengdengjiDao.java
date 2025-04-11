package com.dao;

import com.entity.JiangchengdengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiangchengdengjiView;

/**
 * 奖惩登记 Dao 接口
 *
 * @author 
 */
public interface JiangchengdengjiDao extends BaseMapper<JiangchengdengjiEntity> {

   List<JiangchengdengjiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
