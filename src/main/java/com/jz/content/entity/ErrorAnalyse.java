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
@TableName("ERROR_ANALYSE")
public class ErrorAnalyse implements Serializable {
    @TableId("ID") private String id;
    @TableField("uid") private String uid;
    @TableField("cid") private String cid;
    @TableField("complete_amount") private Integer complete_amount;
    @TableField("correct_amount") private Integer correct_amount;
    @TableField("correct_proportion") private Float correct_proportion;
    @TableField("score") private Float score;
    @TableField("rank") private Integer rank;
}
