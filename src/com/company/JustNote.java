package com.company;

public class JustNote extends Note {

    public JustNote(String author, String content){

        this.authorName = author;
        this.content = content;
    }

    @Override
    public void share() {

    }

    @Override
    public void print(){
        String stringBuilder = "ID: " + this.id + "\n" +
                "Автор: 『" + this.getAuthorName() + "』\n" +
                "Текст:「" + this.getContent() + "」\n" +
                "Рейтинг: " + this.getLikeCount() + "\n" +
                "Избранное: " + this.getShareCount() + "\n";
        System.out.println(stringBuilder);

    }

}
