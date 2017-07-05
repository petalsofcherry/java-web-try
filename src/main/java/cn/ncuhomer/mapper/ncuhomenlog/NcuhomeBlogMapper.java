package cn.ncuhomer.mapper.ncuhomenlog;

import cn.ncuhomer.domain.NcuhomeBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@Mapper
public interface    NcuhomeBlogMapper {

    @Select("")
    public List<NcuhomeBlog> selectByCondition();
}
