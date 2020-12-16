package com.company;

public class FavorNote extends Note{

    protected Note source;

    public FavorNote(String author, String content, Note source) {
        this.authorName = author;
        this.content = content;
        this.source = source;
    }


    @Override
    public void share() {

    }

    @Override
    public void print(){
        String stringBuilder = "ID: " + this.id + "\n" +
                "Автор: 『" + this.getAuthorName() + "』\n" +
                "Текст:「" + this.getContent() + "」\n" +
                "Источник: " + "\n" +
                "ID: " + this.source.id + "\n" +
                "Автор: 『" + this.source.getAuthorName() + "』\n" +
                "Текст:「" + this.source.getContent() + "」\n";
        System.out.println(stringBuilder);
    }
}
