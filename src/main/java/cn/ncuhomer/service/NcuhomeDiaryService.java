package cn.ncuhomer.service;

import cn.ncuhomer.domain.NcuhomeDiary;
import cn.ncuhomer.mapper.ncuhomediary.NcuhomeDiaryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 获得家园志的地址
 * Created by luojingyu on 17-7-5.
 */

@Service
public class NcuhomeDiaryService {

    @Autowired
    private NcuhomeDiaryMapper ncuhomeDiaryMapper;

    public List<NcuhomeDiary> getNcuhomeDiaryResult() {
        List<NcuhomeDiary> preResult = ncuhomeDiaryMapper.selectByCondition();
        for (NcuhomeDiary ncuhomeDiary : preResult) {
            ncuhomeDiary.setUrl(generateUrl(ncuhomeDiary.getUrl()));
            ncuhomeDiary.setTime(ncuhomeDiary.getTime().substring(0,19));
        }
        return preResult;
    }

    private String generateUrl(String id) {
        String preffix = "http://org.ncuhome.cn/?p=";
        return preffix.concat(id);
    }
}
