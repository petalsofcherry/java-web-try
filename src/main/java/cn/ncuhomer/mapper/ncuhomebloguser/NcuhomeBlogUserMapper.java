package cn.ncuhomer.mapper.ncuhomebloguser;

import cn.ncuhomer.domain.NcuhomeBlogUser;
import org.apache.ibatis.annotations.*;

/**
 * Created by luojingyu on 17-7-6.
 */
@Mapper
public interface NcuhomeBlogUserMapper {
    @Select("select * from users where id=#{id}")
    @Results({
            @Result(property = "name", column = "name")
    })
    public NcuhomeBlogUser findById(@Param(value = "id") Integer id);
}
