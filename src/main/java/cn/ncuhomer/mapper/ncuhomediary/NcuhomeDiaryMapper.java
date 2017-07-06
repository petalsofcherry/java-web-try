package cn.ncuhomer.mapper.ncuhomediary;

import cn.ncuhomer.domain.NcuhomeDiary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 家园志映射文件
 * Created by luojingyu on 17-7-5.
 */
@Mapper
public interface NcuhomeDiaryMapper {

    @Select("select ID, post_title, post_modified from wp_blog_posts where post_status='publish' and post_type='post' order by post_modified desc limit 3")
    @Results({
            @Result(property = "url", column = "ID"),
            @Result(property = "title", column = "post_title"),
            @Result(property = "time", column = "post_modified")
    })
    public List<NcuhomeDiary> selectByCondition();
}
