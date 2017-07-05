package cn.ncuhomer.service;

import cn.ncuhomer.domain.NcuhomeBlog;
import cn.ncuhomer.mapper.ncuhomenlog.NcuhomeBlogMapper;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import javax.swing.text.Element;
import java.util.List;

/**
 * Created by luojingyu on 17-7-5.
 */

@Service
public class NcuhomeBlogService {
    @Autowired
    private NcuhomeBlogMapper ncuhomeBlogMapper;

    public List<NcuhomeBlog> getNcuhomeBlogResult() {
        List<NcuhomeBlog> preResult = ncuhomeBlogMapper.selectByCondition();
        for (NcuhomeBlog nchomeblog: preResult) {
            nchomeblog.setHtml(getCover(nchomeblog.getHtml()));
        }
        return preResult;
    }

    private String getCover(String html) {
        org.jsoup.nodes.Document doc = Jsoup.parse(html);
        org.jsoup.nodes.Element link = doc.select("alt='cover").first();
        String coverlink = link.attr("src");
        return coverlink;
    }
}