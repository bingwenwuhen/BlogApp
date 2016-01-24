package cn.com.Enum;

/**
 * 文章类型
 * Created by Administrator on 2016/1/22.
 */
public enum ARTICLETYPE {

    /**
     * 原创文章
     */
    PRIMARY("原创", 1),

    /**
     * 转载文章
     */
    COPY("转载", 2),

    /**
     * 翻译文章
     */
    TRANSLATE("翻译", 3);

    public String name;

    public Integer index;

    ARTICLETYPE(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return this.name;
    }

    public Integer getIndex() {
        return this.index;
    }
}
