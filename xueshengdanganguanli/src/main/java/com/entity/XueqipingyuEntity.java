package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学期评语
 *
 * @author 
 * @email
 */
@TableName("xueqipingyu")
public class XueqipingyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueqipingyuEntity() {

	}

	public XueqipingyuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 评语标题
     */
    @TableField(value = "xueqipingyu_name")

    private String xueqipingyuName;


    /**
     * 评语类型
     */
    @TableField(value = "xueqipingyu_types")

    private Integer xueqipingyuTypes;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 评语详情
     */
    @TableField(value = "xueqipingyu_content")

    private String xueqipingyuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：评语标题
	 */
    public String getXueqipingyuName() {
        return xueqipingyuName;
    }


    /**
	 * 获取：评语标题
	 */

    public void setXueqipingyuName(String xueqipingyuName) {
        this.xueqipingyuName = xueqipingyuName;
    }
    /**
	 * 设置：评语类型
	 */
    public Integer getXueqipingyuTypes() {
        return xueqipingyuTypes;
    }


    /**
	 * 获取：评语类型
	 */

    public void setXueqipingyuTypes(Integer xueqipingyuTypes) {
        this.xueqipingyuTypes = xueqipingyuTypes;
    }
    /**
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }


    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：评语详情
	 */
    public String getXueqipingyuContent() {
        return xueqipingyuContent;
    }


    /**
	 * 获取：评语详情
	 */

    public void setXueqipingyuContent(String xueqipingyuContent) {
        this.xueqipingyuContent = xueqipingyuContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xueqipingyu{" +
            "id=" + id +
            ", xueqipingyuName=" + xueqipingyuName +
            ", xueqipingyuTypes=" + xueqipingyuTypes +
            ", jiaoshiId=" + jiaoshiId +
            ", yonghuId=" + yonghuId +
            ", xueqipingyuContent=" + xueqipingyuContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
