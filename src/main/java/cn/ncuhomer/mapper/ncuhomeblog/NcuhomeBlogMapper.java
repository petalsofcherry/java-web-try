package cn.ncuhomer.mapper.ncuhomeblog;

import cn.ncuhomer.domain.NcuhomeBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@Mapper
public interface    NcuhomeBlogMapper {

    @Select("select p.title, p.slug, p.html, p.updated_at, u.name from posts p left join users u on u.id=p.created_by order by p.updated_at desc limit 1")
    @Results({
            @Result(property = "title", column = "title"),
            @Result(property = "url", column = "slug"),
            @Result(property = "cover", column = "html"),
            @Result(property = "updated_at", column = "updated_at"),
            @Result(property = "name", column = "name")
    })
    public List<NcuhomeBlog> selectByCondition();
}
