package com.company;

public abstract class Note {
    protected static int count = 0;
    protected String authorName;
    protected String content;
    protected int likeCount;
    protected static int shareCount;

    public int getId() {
        return id;
    }

    protected int id;

    public String getAuthorName() {
        return authorName;
    }

    public String getContent() {
        return content;
    }

    public int getLikeCount() {
        return likeCount;
    }


    public int getShareCount() {
        return shareCount;
    }

    public Note(){
        this.id = count;
        count++;
    }

    public abstract void share();

    public void like(){
        likeCount++;
    }
    public abstract void print();

}
