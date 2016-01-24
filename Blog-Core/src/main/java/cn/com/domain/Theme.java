package cn.com.domain;

import lombok.Data;

/**
 * 文章类型
 * Created by Administrator on 2016/1/21.
 */
@Data
public class Theme {

    /**
     * 类型id
     */
    private Long id;

    /**
     * 文章类型
     */
    private String name;
}
