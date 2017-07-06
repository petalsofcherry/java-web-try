package cn.ncuhomer.mapper.ncuhomebloguser;

import cn.ncuhomer.domain.NcuhomeBlogUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by luojingyu on 17-7-6.
 */
public interface NcuhomeBlogUserMapper {
    @Select("select * from users where id=#{id}")
    @Results({
            @Result(property = "name", column = "name")
    })
    NcuhomeBlogUser findById(Integer id);
}
