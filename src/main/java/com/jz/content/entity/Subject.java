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
@TableName("SUBJECT_TABLE")
public class Subject implements Serializable {
    @TableId("ID") private String id;
    @TableField("grade") private String grade;
    @TableField("term") private String term;
}
