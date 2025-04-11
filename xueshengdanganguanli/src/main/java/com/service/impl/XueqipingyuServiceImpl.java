package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.XueqipingyuDao;
import com.entity.XueqipingyuEntity;
import com.service.XueqipingyuService;
import com.entity.view.XueqipingyuView;

/**
 * 学期评语 服务实现类
 */
@Service("xueqipingyuService")
@Transactional
public class XueqipingyuServiceImpl extends ServiceImpl<XueqipingyuDao, XueqipingyuEntity> implements XueqipingyuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XueqipingyuView> page =new Query<XueqipingyuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
