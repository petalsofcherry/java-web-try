package cn.ncuhomer.domain;

import java.time.LocalDateTime;

/**
 * Created by luojingyu on 17-7-5.
 */
public class NcuhomeDairy {
    private Integer ID;
    private String post_title;
    private LocalDateTime post_modified;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public LocalDateTime getPost_modified() {
        return post_modified;
    }

    public void setPost_modified(LocalDateTime post_modified) {
        this.post_modified = post_modified;
    }
}
