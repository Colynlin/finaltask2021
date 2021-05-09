package com.jz.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author ColynLin
 * @Date 2021/5/7 17:45
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("COMPETATION_TABLE")
public class Competition implements Serializable {
    @TableId("ID") private String id;
    @TableField("com_id") private String com_id;
    @TableField("times") private Integer times;
    @TableField("competition_name") private String competition_name;
    @TableField("competition_type") private String competition_type;
}
