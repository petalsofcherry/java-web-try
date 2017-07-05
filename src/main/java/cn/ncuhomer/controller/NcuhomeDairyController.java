package cn.ncuhomer.controller;

import cn.ncuhomer.domain.NcuhomeDairy;
import cn.ncuhomer.domain.Result;
import cn.ncuhomer.service.NcuhomeDairyService;
import cn.ncuhomer.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@RestController
public class NcuhomeDairyController {

    @Autowired
    private NcuhomeDairyService ncuhomeDairyService;

    @GetMapping("/ncuhomedairy")
    public Result<List<NcuhomeDairy>> getNcuhomeDairy() {
        return ResultUtils.success(ncuhomeDairyService.getNcuhomeDairyResult());
    }

}
