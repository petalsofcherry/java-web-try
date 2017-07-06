package cn.ncuhomer.service;

import cn.ncuhomer.domain.NcuhomeBlog;
import cn.ncuhomer.domain.NcuhomeBlogUser;
import cn.ncuhomer.mapper.ncuhomeblog.NcuhomeBlogMapper;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            nchomeblog.setCover(getCover(nchomeblog.getCover()));
            nchomeblog.setUrl(getUrl(nchomeblog.getUrl()));
        }
        return preResult;
    }

    private String getCover(String html) {
        org.jsoup.nodes.Document doc = Jsoup.parse(html);
        org.jsoup.nodes.Element link = doc.select("img[alt='cover']").first();
        if (link == null) {
            return null;
        }
        String coverlink = link.attr("src");
        return coverlink;
    }

    private String getUrl(String url) {
        return "http://blog.ncuos.com/" + url;
    }
}
