package com.company;

public class AddressNote extends Note{

    protected String address;
    public AddressNote(String author, String content, String address){

        this.authorName = author;
        this.content = content;
        this.address = address;
    }

    @Override
    public void share() {
        shareCount++;
    }

    @Override
    public void print(){
        String stringBuilder = "ID: " + this.id + "\n" +
                "Автор: 『" + this.getAuthorName() + "』\n" +
                "Текст:「" + this.getContent() + "」\n" +
                "Место: " + this.address + "\n" +
                "Рейтинг: " + this.getLikeCount() + "\n" +
                "Избранное: " + this.getShareCount() + "\n";
        System.out.println(stringBuilder);
    }
}
