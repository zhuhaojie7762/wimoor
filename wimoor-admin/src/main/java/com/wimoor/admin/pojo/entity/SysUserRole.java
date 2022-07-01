package com.wimoor.admin.pojo.entity;

import java.math.BigInteger;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName("t_user_role")
public class SysUserRole {
	
	@TableField(value= "user_id")
    private BigInteger userId;

	@TableField(value= "role_id")
    private BigInteger roleId;

}
