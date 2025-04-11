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
 * 学生档案
 *
 * @author 
 * @email
 */
@TableName("xueshengdangan")
public class XueshengdanganEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengdanganEntity() {

	}

	public XueshengdanganEntity(T t) {
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
     * 档案标题
     */
    @TableField(value = "xueshengdangan_name")

    private String xueshengdanganName;


    /**
     * 档案文件
     */
    @TableField(value = "xueshengdangan_file")

    private String xueshengdanganFile;


    /**
     * 详情
     */
    @TableField(value = "xueshengdangan_text")

    private String xueshengdanganText;


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
	 * 设置：档案标题
	 */
    public String getXueshengdanganName() {
        return xueshengdanganName;
    }


    /**
	 * 获取：档案标题
	 */

    public void setXueshengdanganName(String xueshengdanganName) {
        this.xueshengdanganName = xueshengdanganName;
    }
    /**
	 * 设置：档案文件
	 */
    public String getXueshengdanganFile() {
        return xueshengdanganFile;
    }


    /**
	 * 获取：档案文件
	 */

    public void setXueshengdanganFile(String xueshengdanganFile) {
        this.xueshengdanganFile = xueshengdanganFile;
    }
    /**
	 * 设置：详情
	 */
    public String getXueshengdanganText() {
        return xueshengdanganText;
    }


    /**
	 * 获取：详情
	 */

    public void setXueshengdanganText(String xueshengdanganText) {
        this.xueshengdanganText = xueshengdanganText;
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
        return "Xueshengdangan{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xueshengdanganName=" + xueshengdanganName +
            ", xueshengdanganFile=" + xueshengdanganFile +
            ", xueshengdanganText=" + xueshengdanganText +
            ", createTime=" + createTime +
        "}";
    }
}
