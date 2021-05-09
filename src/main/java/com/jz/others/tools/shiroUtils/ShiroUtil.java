package com.jz.others.tools.shiroUtils;

import com.jz.others.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @Author ColynLin
 * @Date 2020/10/19 23:48
 */
public class ShiroUtil {
    public static AccountProfile getProfile() {
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}