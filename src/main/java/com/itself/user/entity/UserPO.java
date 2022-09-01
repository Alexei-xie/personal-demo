package com.itself.user.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author xxw
 * @Date 2022/07/09
 */
@Data
@TableName("user")
public class UserPO {
    @TableId
    private Integer id;
    private String name;
    private Integer age;
    private BigDecimal price;
}
