package cn.com.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by xiaxuan on 16/1/6.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职业
     */
    private String job;

    /**
     * 地址
     */
    private String address;

    /**
     * email
     */
    private String email;
}
