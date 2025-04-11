package com.entity.model;

import com.entity.XueshengdanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生档案
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengdanganModel implements Serializable {
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
     * 档案标题
     */
    private String xueshengdanganName;


    /**
     * 档案文件
     */
    private String xueshengdanganFile;


    /**
     * 详情
     */
    private String xueshengdanganText;


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
	 * 获取：档案标题
	 */
    public String getXueshengdanganName() {
        return xueshengdanganName;
    }


    /**
	 * 设置：档案标题
	 */
    public void setXueshengdanganName(String xueshengdanganName) {
        this.xueshengdanganName = xueshengdanganName;
    }
    /**
	 * 获取：档案文件
	 */
    public String getXueshengdanganFile() {
        return xueshengdanganFile;
    }


    /**
	 * 设置：档案文件
	 */
    public void setXueshengdanganFile(String xueshengdanganFile) {
        this.xueshengdanganFile = xueshengdanganFile;
    }
    /**
	 * 获取：详情
	 */
    public String getXueshengdanganText() {
        return xueshengdanganText;
    }


    /**
	 * 设置：详情
	 */
    public void setXueshengdanganText(String xueshengdanganText) {
        this.xueshengdanganText = xueshengdanganText;
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
