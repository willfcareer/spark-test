package org.hy.dev.spark.similarity;

/**
 * @author edwin
 * @since 18 May 2017
 */
public class TfIdfData {
    private String id;
    private String title;
    private String segment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
