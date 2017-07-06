package cn.ncuhomer.controller;

import cn.ncuhomer.domain.NcuhomeDiary;
import cn.ncuhomer.domain.Result;
import cn.ncuhomer.service.NcuhomeDiaryService;
import cn.ncuhomer.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@RestController
public class NcuhomeDiaryController {

    @Autowired
    private NcuhomeDiaryService ncuhomeDiaryService;

    @GetMapping("/ncuhomediary")
    public Result<List<NcuhomeDiary>> getNcuhomeDairy() {
        return ResultUtils.success(ncuhomeDiaryService.getNcuhomeDiaryResult());
    }

}
