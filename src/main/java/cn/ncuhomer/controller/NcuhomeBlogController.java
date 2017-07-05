package cn.ncuhomer.controller;

import cn.ncuhomer.domain.NcuhomeBlog;
import cn.ncuhomer.domain.Result;
import cn.ncuhomer.service.NcuhomeBlogService;
import cn.ncuhomer.utils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
    public Result<List<NcuhomeBlog>> getNcuhomeBlog(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtils.error(bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtils.success(ncuhomeBlogService.getNcuhomeBlogResult());
    }
}
