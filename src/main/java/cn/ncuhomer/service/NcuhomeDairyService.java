package cn.ncuhomer.service;

import cn.ncuhomer.domain.NcuhomeDairy;
import cn.ncuhomer.mapper.ncuhomedairy.NcuhomeDairyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */

@Service
public class NcuhomeDairyService {

    @Autowired
    private NcuhomeDairyMapper ncuhomeDairyMapper;

    public List<NcuhomeDairy> getNcuhomeDairyResult() {
        List<NcuhomeDairy> preResult = ncuhomeDairyMapper.selectByCondition();
        for (NcuhomeDairy ncuhomeDairy: preResult) {
            ncuhomeDairy.setUrl(generateUrl(ncuhomeDairy.getUrl()));
        }
        return preResult;
    }

    private String generateUrl(String id) {
        String preffix = "http://org.ncuhome.cn/?p=";
        return preffix.concat(id);
    }
}
