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
@TableName("ACCOUNT_TABLE")
public class Account implements Serializable {
    @TableId("ID") private String id;
    @TableField("account_id") private String account_id;
    @TableField("point") private Integer point;
    @TableField("coin") private Integer coin;
}
