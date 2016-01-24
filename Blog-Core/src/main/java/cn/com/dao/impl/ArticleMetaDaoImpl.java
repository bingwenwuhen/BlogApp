package cn.com.dao.impl;

import cn.com.Enum.ARTICLESTATUS;
import cn.com.dao.ArticleMetaDao;
import cn.com.domain.ArticleMeta;
import cn.com.log.LogPerformance;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/1/20.
 */
@Repository("articleMetaDao")
public class ArticleMetaDaoImpl implements ArticleMetaDao {

    @Inject
    private Datastore datastore;

    @LogPerformance
    @Override
    public List<ArticleMeta> getArticleByUserId(Long userId) {
        return datastore.createQuery(ArticleMeta.class).field("userId").equal(userId).field("status").equal(ARTICLESTATUS.ACTICE.ordinal()).asList();
    }

    @LogPerformance
    @Override
    public List<ArticleMeta> getArticleByArticleName(String articleName) {
        return datastore.createQuery(ArticleMeta.class).field("articleName").contains(articleName).field("status").equal(ARTICLESTATUS.ACTICE.ordinal()).asList();
    }

    @LogPerformance
    @Override
    public void deleteArticleByfilesId(String articleId) {
        Query<ArticleMeta> query = datastore.createQuery(ArticleMeta.class).filter("articleId=", articleId);
        UpdateOperations<ArticleMeta> updateOperations = datastore.createUpdateOperations(ArticleMeta.class)
                .set("status", ARTICLESTATUS.DELETE.ordinal());
        datastore.update(query, updateOperations);
    }

    @LogPerformance
    @Override
    public List<ArticleMeta> loadArticleRecently() {
        return datastore.createQuery(ArticleMeta.class).field("createTime").lessThanOrEq(new Date())
                .field("createTime").greaterThanOrEq(new Date((new Date().getTime() - 43200000)))
                .field("type").notEqual(ARTICLESTATUS.DELETE.ordinal()).asList();
    }
}
