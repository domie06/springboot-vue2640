package com.entity.model;

import com.entity.XueshengzizhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资助记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengzizhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 标题
     */
    private String xueshengzizhuName;


    /**
     * 资助金额
     */
    private Double xueshengzizhuJine;


    /**
     * 详情
     */
    private String xueshengzizhuText;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：标题
	 */
    public String getXueshengzizhuName() {
        return xueshengzizhuName;
    }


    /**
	 * 设置：标题
	 */
    public void setXueshengzizhuName(String xueshengzizhuName) {
        this.xueshengzizhuName = xueshengzizhuName;
    }
    /**
	 * 获取：资助金额
	 */
    public Double getXueshengzizhuJine() {
        return xueshengzizhuJine;
    }


    /**
	 * 设置：资助金额
	 */
    public void setXueshengzizhuJine(Double xueshengzizhuJine) {
        this.xueshengzizhuJine = xueshengzizhuJine;
    }
    /**
	 * 获取：详情
	 */
    public String getXueshengzizhuText() {
        return xueshengzizhuText;
    }


    /**
	 * 设置：详情
	 */
    public void setXueshengzizhuText(String xueshengzizhuText) {
        this.xueshengzizhuText = xueshengzizhuText;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
