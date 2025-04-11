package com.entity.vo;

import com.entity.JiangchengdengjiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 奖惩登记
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiangchengdengji")
public class JiangchengdengjiVO implements Serializable {
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

}
