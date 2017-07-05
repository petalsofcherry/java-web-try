package cn.ncuhomer.controller;

import cn.ncuhomer.domain.NcuhomeDairy;
import cn.ncuhomer.mapper.ncuhomedairy.NcuhomeDairyMapper;
import cn.ncuhomer.service.NcuhomeDairyService;
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
    public List<NcuhomeDairy> getNcuhomeDairy() {
        return ncuhomeDairyService.getNcuhomeDairyResult();
    }

}
