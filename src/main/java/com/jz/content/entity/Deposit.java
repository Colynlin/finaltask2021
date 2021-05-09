package com.jz.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.sql.Time;

/**
 * @Author ColynLin
 * @Date 2021/5/7 17:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("DEPOSIT_TABLE")
public class Deposit implements Serializable {
    @TableId("ID") private String id;
    @TableField("account_id") private String account_id;
    @TableField("deposit_time") private Time deposit_time;
    @TableField("coin_consume") private Integer coin_consume;
    @TableField("consume") private Float consume;
    @TableField("topic") private String topic;
}
