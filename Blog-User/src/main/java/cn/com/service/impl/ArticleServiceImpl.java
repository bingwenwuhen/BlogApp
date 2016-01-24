package cn.com.service.impl;

import cn.com.dao.ArticleDao;
import cn.com.domain.Article;
import cn.com.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/1/20.
 */
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

    @Inject
    private ArticleDao articleDao;

    @Override
    public void addArticle(Article article) {
        articleDao.addArticle(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleDao.updateArticle(article);
    }

    @Override
    public Article loadArticle(String articleId) {
        return articleDao.loadArticle(articleId);
    }
}
