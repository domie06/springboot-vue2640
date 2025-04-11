package com.entity.vo;

import com.entity.XueshengdanganEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生档案
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengdangan")
public class XueshengdanganVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
