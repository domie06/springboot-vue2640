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
 * 奖惩登记
 *
 * @author 
 * @email
 */
@TableName("jiangchengdengji")
public class JiangchengdengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiangchengdengjiEntity() {

	}

	public JiangchengdengjiEntity(T t) {
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
     * 学生
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 标题
     */
    @TableField(value = "jiangchengdengji_name")

    private String jiangchengdengjiName;


    /**
     * 奖惩类型
     */
    @TableField(value = "jiangchengdengji_types")

    private Integer jiangchengdengjiTypes;


    /**
     * 详情
     */
    @TableField(value = "jiangchengdengji_text")

    private String jiangchengdengjiText;


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
	 * 设置：标题
	 */
    public String getJiangchengdengjiName() {
        return jiangchengdengjiName;
    }


    /**
	 * 获取：标题
	 */

    public void setJiangchengdengjiName(String jiangchengdengjiName) {
        this.jiangchengdengjiName = jiangchengdengjiName;
    }
    /**
	 * 设置：奖惩类型
	 */
    public Integer getJiangchengdengjiTypes() {
        return jiangchengdengjiTypes;
    }


    /**
	 * 获取：奖惩类型
	 */

    public void setJiangchengdengjiTypes(Integer jiangchengdengjiTypes) {
        this.jiangchengdengjiTypes = jiangchengdengjiTypes;
    }
    /**
	 * 设置：详情
	 */
    public String getJiangchengdengjiText() {
        return jiangchengdengjiText;
    }


    /**
	 * 获取：详情
	 */

    public void setJiangchengdengjiText(String jiangchengdengjiText) {
        this.jiangchengdengjiText = jiangchengdengjiText;
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
        return "Jiangchengdengji{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jiaoshiId=" + jiaoshiId +
            ", jiangchengdengjiName=" + jiangchengdengjiName +
            ", jiangchengdengjiTypes=" + jiangchengdengjiTypes +
            ", jiangchengdengjiText=" + jiangchengdengjiText +
            ", createTime=" + createTime +
        "}";
    }
}
