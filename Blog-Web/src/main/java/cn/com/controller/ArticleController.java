package cn.com.controller;

import cn.com.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/1/19.
 */
@Slf4j
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Inject
    private ArticleService articleService;

}
