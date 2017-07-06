package cn.ncuhomer.domain;

/**
 * Created by luojingyu on 17-7-5.
 */
public class NcuhomeBlog {
    private String url;
    private String title;
    private String cover;
    private NcuhomeBlogUser author;
    private Integer created_by;
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public NcuhomeBlogUser getAuthor() {
        return author;
    }

    public void setAuthor(NcuhomeBlogUser author) {
        this.author = author;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }
}
