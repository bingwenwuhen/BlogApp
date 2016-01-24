package cn.com.dao;

import cn.com.domain.Article;

/**
 * Created by Administrator on 2016/1/20.
 */
public interface ArticleDao {

    /**
     * 新增文章
     * @param article
     * @return
     */
    void addArticle(Article article);

    /**
     * 更新文章
     * @param article
     */
    void updateArticle(Article article);

    /**
     * 加载文章
     * @param articleId
     * @return
     */
    Article loadArticle(String articleId);

}
