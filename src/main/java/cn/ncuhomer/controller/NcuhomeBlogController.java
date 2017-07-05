package cn.ncuhomer.controller;

import cn.ncuhomer.domain.NcuhomeBlog;
import cn.ncuhomer.service.NcuhomeBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */
@RestController
public class NcuhomeBlogController {

    @Autowired
    private NcuhomeBlogService ncuhomeBlogService;

    @GetMapping("/ncuhomeblog")
    public List<NcuhomeBlog> getNcuhomeBlog() {
        return ncuhomeBlogService.getNcuhomeBlogResult();
    }
}
