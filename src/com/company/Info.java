package com.company;

import java.util.ArrayList;

public class Info {

    private final ArrayList<Note> posts = new ArrayList();
    public void add(Note post) {
        this.posts.add(post);
    }

    public void Remove(int id){
        posts.remove(id);
    }

    public void print(){
        for (int i = posts.size()-1; i >= 0; i --)
        {
            posts.get(i).print();
        }
    }


    public Note getPost(int id) {
        for(Note post: posts){
            if (post.getId() == id)
            {
                return post;
            }

        }
        return null;
    }

    public void print(String author) {

        for (Note post : posts)
        {
            if (post.getAuthorName().equals(author) && post instanceof FavorNote) post.print();
        }
    }
}
