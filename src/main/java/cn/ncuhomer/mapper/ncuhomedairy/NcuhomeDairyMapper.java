package cn.ncuhomer.mapper.ncuhomedairy;

import cn.ncuhomer.domain.NcuhomeDairy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@Mapper
public interface NcuhomeDairyMapper {

    @Select("select ID, post_title, post_modified from wp_blog_posts where post_status='publish' and post_type='post' order by post_modified desc limit 3")
    @Results({
            @Result(property = "url", column = "ID"),
            @Result(property = "title", column = "post_title"),
            @Result(property = "time", column = "post_modified")
    })
    public List<NcuhomeDairy> selectByCondition();
}
