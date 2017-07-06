package cn.ncuhomer.mapper.ncuhomeblog;

import cn.ncuhomer.domain.NcuhomeBlog;
import cn.ncuhomer.domain.NcuhomeBlogUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@Mapper
public interface NcuhomeBlogMapper {

    @Select("select * from posts order by updated_at desc limit 3")
    @Results({
            @Result(property = "title", column = "title"),
            @Result(property = "url", column = "slug"),
            @Result(property = "cover", column = "html"),
            @Result(property = "time", column = "updated_at"),
            @Result(property = "author", column = "created_by", one = @One(select = "cn.ncuhomer.mapper.ncuhomebloguser.NcuhomeBlogUserMapper.findById"))
    })
    public List<NcuhomeBlog> selectByCondition();
}
