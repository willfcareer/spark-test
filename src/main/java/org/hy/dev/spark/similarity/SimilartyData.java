package org.hy.dev.spark.similarity;

/**
 * @author edwin
 * @since 18 May 2017
 */
public class SimilartyData {
    private String id;
    private String title;
    private Double similarty;

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

    public Double getSimilarty() {
        return similarty;
    }

    public void setSimilarty(Double similarty) {
        this.similarty = similarty;
    }
}
