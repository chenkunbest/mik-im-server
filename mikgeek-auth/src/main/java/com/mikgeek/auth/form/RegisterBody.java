package com.mikgeek.auth.form;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户注册对象
 *
 * @author chenkunbest
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RegisterBody extends LoginBody {

    private String userType;

}