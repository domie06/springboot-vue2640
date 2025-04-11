package com.entity.model;

import com.entity.XueqipingyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学期评语
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueqipingyuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 评语标题
     */
    private String xueqipingyuName;


    /**
     * 评语类型
     */
    private Integer xueqipingyuTypes;


    /**
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 评语详情
     */
    private String xueqipingyuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：评语标题
	 */
    public String getXueqipingyuName() {
        return xueqipingyuName;
    }


    /**
	 * 设置：评语标题
	 */
    public void setXueqipingyuName(String xueqipingyuName) {
        this.xueqipingyuName = xueqipingyuName;
    }
    /**
	 * 获取：评语类型
	 */
    public Integer getXueqipingyuTypes() {
        return xueqipingyuTypes;
    }


    /**
	 * 设置：评语类型
	 */
    public void setXueqipingyuTypes(Integer xueqipingyuTypes) {
        this.xueqipingyuTypes = xueqipingyuTypes;
    }
    /**
	 * 获取：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 设置：教师
	 */
    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：评语详情
	 */
    public String getXueqipingyuContent() {
        return xueqipingyuContent;
    }


    /**
	 * 设置：评语详情
	 */
    public void setXueqipingyuContent(String xueqipingyuContent) {
        this.xueqipingyuContent = xueqipingyuContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
