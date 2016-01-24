package cn.com.dao.impl;

import cn.com.dao.ArticleDao;
import cn.com.domain.Article;
import cn.com.log.LogPerformance;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/1/20.
 */
@Repository("articleDao")
public class ArticleDaoImpl implements ArticleDao {

    @Inject
    private Datastore datastore;

    @LogPerformance
    @Override
    public void addArticle(Article article) {
         datastore.save(article);
    }

    @LogPerformance
    @Override
    public void updateArticle(Article article) {
        Query<Article> query = datastore.createQuery(Article.class).filter("id",  new ObjectId(article.getId()));
        UpdateOperations<Article> updateOperations = datastore.createUpdateOperations(Article.class)
                .set("content", article.getContent());
        datastore.update(query, updateOperations);
    }

    @LogPerformance
    @Override
    public Article loadArticle(String articleId) {
        return datastore.createQuery(Article.class).field("id").equal(new ObjectId(articleId)).get();
    }
}
