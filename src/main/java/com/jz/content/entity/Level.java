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
 * @Date 2021/5/7 17:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("LEVEL_TABLE")
public class Level implements Serializable {
    @TableId("ID") private String id;
    @TableField("user_id") private String user_id;
    @TableField("information_id") private String information_id;
    @TableField("best_score") private Float best_score;
    @TableField("rank") private Integer rank;
    @TableField("complete_amount") private Integer complete_amount;
    @TableField("correct_amount") private Integer correct_amount;
    @TableField("correct_proportion") private Float correct_proportion;
    @TableField("human_amount") private Integer human_amount;
}
