package com.example.demo.dto;

public class Post {
    public Post(int postId, String nickName, String title){
        this.postId = postId;
        this.nickName = nickName;
        this.title = title;
    }
    int postId;
    String nickName;
    String title;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
