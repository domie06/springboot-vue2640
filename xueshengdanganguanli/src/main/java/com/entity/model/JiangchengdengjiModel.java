package com.entity.model;

import com.entity.JiangchengdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 奖惩登记
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiangchengdengjiModel implements Serializable {
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
    private String jiangchengdengjiName;


    /**
     * 奖惩类型
     */
    private Integer jiangchengdengjiTypes;


    /**
     * 详情
     */
    private String jiangchengdengjiText;


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
    public String getJiangchengdengjiName() {
        return jiangchengdengjiName;
    }


    /**
	 * 设置：标题
	 */
    public void setJiangchengdengjiName(String jiangchengdengjiName) {
        this.jiangchengdengjiName = jiangchengdengjiName;
    }
    /**
	 * 获取：奖惩类型
	 */
    public Integer getJiangchengdengjiTypes() {
        return jiangchengdengjiTypes;
    }


    /**
	 * 设置：奖惩类型
	 */
    public void setJiangchengdengjiTypes(Integer jiangchengdengjiTypes) {
        this.jiangchengdengjiTypes = jiangchengdengjiTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getJiangchengdengjiText() {
        return jiangchengdengjiText;
    }


    /**
	 * 设置：详情
	 */
    public void setJiangchengdengjiText(String jiangchengdengjiText) {
        this.jiangchengdengjiText = jiangchengdengjiText;
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
