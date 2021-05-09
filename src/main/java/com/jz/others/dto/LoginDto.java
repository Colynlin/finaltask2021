package com.jz.others.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @Author ColynLin
 * @Date 2020/10/21 21:29
 * 登录时解析参数的实体类
 */
@Data
public class LoginDto implements Serializable {

    //@NotBlank(message = "昵称不能为空")
    private String name;

    private String tel;

    //@NotBlank(message = "密码不能为空")
    private String password;
}
