package cn.ncuhomer.mapper.ncuhomebloguser;

import cn.ncuhomer.domain.NcuhomeBlogUser;
import org.apache.ibatis.annotations.Select;

/**
 * Created by luojingyu on 17-7-6.
 */
public interface NcuhomeBlogUserMapper {
    @Select("select name from users where id=#{id}")
    NcuhomeBlogUser findById(int id);
}
