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
import com.dao.XueshengzizhuDao;
import com.entity.XueshengzizhuEntity;
import com.service.XueshengzizhuService;
import com.entity.view.XueshengzizhuView;

/**
 * 资助记录 服务实现类
 */
@Service("xueshengzizhuService")
@Transactional
public class XueshengzizhuServiceImpl extends ServiceImpl<XueshengzizhuDao, XueshengzizhuEntity> implements XueshengzizhuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<XueshengzizhuView> page =new Query<XueshengzizhuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
