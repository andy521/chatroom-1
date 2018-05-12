package com.howie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description 用户实体类
 * @Date 2018-05-11
 * @Time 21:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String nick;
    private String address;
    private long loginTime;
}
