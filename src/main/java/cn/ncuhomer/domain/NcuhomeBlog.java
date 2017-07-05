package cn.ncuhomer.domain;
import java.time.LocalDateTime;

/**
 * Created by luojingyu on 17-7-5.
 */
public class NcuhomeBlog {
    private Integer id;
    private String url;
    private String title;
    private String cover;
    private NcuhomeBlogUser ncuhomeBlogUser;
    private LocalDateTime updated_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NcuhomeBlogUser getNcuhomeBlogUser() {
        return ncuhomeBlogUser;
    }

    public void setNcuhomeBlogUser(NcuhomeBlogUser ncuhomeBlogUser) {
        this.ncuhomeBlogUser = ncuhomeBlogUser;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
