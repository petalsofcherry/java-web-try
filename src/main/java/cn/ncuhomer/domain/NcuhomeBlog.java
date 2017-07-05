package cn.ncuhomer.domain;

/**
 * Created by luojingyu on 17-7-5.
 */
public class NcuhomeBlog {
    private Integer id;
    private String url;
    private String title;
    private String cover;
    private NcuhomeBlogUser ncuhomeBlogUser;
    private String time;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
