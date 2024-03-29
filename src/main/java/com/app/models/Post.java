package com.app.models;

public class Post {
    private int idPost;
    private int idCandidat;
    private String post;
    private String video;
    private int idCategory;

    private String firstnameCand;
    private String lastnameCand;
    private String category;
    private String imgCand;
    private int likes;

    public Post() {

    }

    public Post(int idPost, String post, String video, int idCategory,int idCandidat, int likes, String firstnameCand, String lastnameCand, String category, String imgCand) {
        this.idPost = idPost;
        this.idCandidat = idCandidat;
        this.post = post;
        this.video = video;
        this.idCategory = idCategory;
        this.likes = likes;
        this.firstnameCand = firstnameCand;
        this.lastnameCand = lastnameCand;
        this.category = category;
        this.imgCand = imgCand;

    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getImgCand() {
        return imgCand;
    }

    public void setImgCand(String imgCand) {
        this.imgCand = imgCand;
    }

    public String getFirstnameCand() {
        return firstnameCand;
    }

    public void setFirstnameCand(String firstnameCand) {
        this.firstnameCand = firstnameCand;
    }

    public String getLastnameCand() {
        return lastnameCand;
    }

    public void setLastnameCand(String lastnameCand) {
        this.lastnameCand = lastnameCand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getIdCandidat() {
        return idCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        this.idCandidat = idCandidat;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }
}