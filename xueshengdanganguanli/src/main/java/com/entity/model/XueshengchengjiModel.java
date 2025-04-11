package com.entity.model;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生成绩
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengchengjiModel implements Serializable {
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
     * 教师
     */
    private Integer jiaoshiId;


    /**
     * 标题
     */
    private String xueshengchengjiName;


    /**
     * 学科
     */
    private Integer xueshengchengjiTypes;


    /**
     * 成绩
     */
    private Integer xueshengchengjiChengji;


    /**
     * 详情
     */
    private String xueshengchengjiText;


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
	 * 获取：标题
	 */
    public String getXueshengchengjiName() {
        return xueshengchengjiName;
    }


    /**
	 * 设置：标题
	 */
    public void setXueshengchengjiName(String xueshengchengjiName) {
        this.xueshengchengjiName = xueshengchengjiName;
    }
    /**
	 * 获取：学科
	 */
    public Integer getXueshengchengjiTypes() {
        return xueshengchengjiTypes;
    }


    /**
	 * 设置：学科
	 */
    public void setXueshengchengjiTypes(Integer xueshengchengjiTypes) {
        this.xueshengchengjiTypes = xueshengchengjiTypes;
    }
    /**
	 * 获取：成绩
	 */
    public Integer getXueshengchengjiChengji() {
        return xueshengchengjiChengji;
    }


    /**
	 * 设置：成绩
	 */
    public void setXueshengchengjiChengji(Integer xueshengchengjiChengji) {
        this.xueshengchengjiChengji = xueshengchengjiChengji;
    }
    /**
	 * 获取：详情
	 */
    public String getXueshengchengjiText() {
        return xueshengchengjiText;
    }


    /**
	 * 设置：详情
	 */
    public void setXueshengchengjiText(String xueshengchengjiText) {
        this.xueshengchengjiText = xueshengchengjiText;
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
