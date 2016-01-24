package cn.com.domain;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2016/1/17.
 */
@Data
public class ArticleMeta {

    /**
     * id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 文章id
     */
    private String articleId;

    /**
     * 文章名字
     */
    private String articleName;

    /**
     * 文章状态,1表示正常，2表示保存中，3表示修改
     */
    private Integer status;

    /**
     * 文章类型
     */
    private Integer type;

    /**
     * 文章主题
     */
    private Integer themeId;
}
