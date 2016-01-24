package cn.com.mapper;

import cn.com.domain.Theme;
import cn.com.log.LogPerformance;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Administrator on 2016/1/21.
 */
public interface ThemeMapper {

    @LogPerformance
    @Insert("insert into theme(name) values(#{name})")
    void addTheme(Theme theme);

    @LogPerformance
    @Delete("delete from theme where name = #{name}")
    void deleteTheme(@Param("name") String name);

    @LogPerformance
    @Update("update theme set name = #{newname} where name = #{oldname}")
    void updateTheme(@Param("newname") String newname,
                           @Param("oldname") String oldname);

}
