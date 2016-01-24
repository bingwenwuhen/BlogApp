package cn.com.service;

import cn.com.domain.ArticleMeta;

import java.util.List;

/**
 * Created by Administrator on 2016/1/20.
 */
public interface ArticleMetaService {
    /**
     * 根据作者id获取文章列表
     * @param userId
     * @return
     */
    List<ArticleMeta> getArticleByUserId(Long userId);

    /**
     * 根据文章名字寻找文章
     * @param articleName
     * @return
     */
    List<ArticleMeta> getArticleByArticleName(String articleName);

    /**
     * 删除文章
     * @param articleId
     */
    void  deleteArticleByfilesId(String articleId);

    /**
     * 缓存最近一个月的文章
     * @return
     */
    List<ArticleMeta> loadArticleRecently();
}
