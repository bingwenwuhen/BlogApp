package cn.com.service.impl;

import cn.com.dao.ArticleMetaDao;
import cn.com.domain.ArticleMeta;
import cn.com.service.ArticleMetaService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2016/1/20.
 */
@Service("articleMetaService")
public class ArticleMetaServiceImpl implements ArticleMetaService {

    @Inject
    private ArticleMetaDao articleMetaDao;

    @Override
    public List<ArticleMeta> getArticleByUserId(Long userId) {
        return articleMetaDao.getArticleByUserId(userId);
    }

    @Override
    public List<ArticleMeta> getArticleByArticleName(String articleName) {
        return articleMetaDao.getArticleByArticleName(articleName);
    }

    @Override
    public void deleteArticleByfilesId(String articleId) {
        articleMetaDao.deleteArticleByfilesId(articleId);
    }

    @Override
    public List<ArticleMeta> loadArticleRecently() {
        return articleMetaDao.loadArticleRecently();
    }
}
