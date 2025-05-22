package com.ahmetvatansever.FlyweightPatternSocialMediaPost;

public class SharedPost implements Post{
    private String username;
    private String text;
    private String imageUrl;

    public SharedPost(String username, String text, String imageUrl) {
        this.username = username;
        this.text = text;
        this.imageUrl = imageUrl;
    }

    @Override
    public void display() {
        System.out.println("Username  : " + username);
        System.out.println("Text      : " + text);
        System.out.println("Image URL : " + imageUrl);
        System.out.println("Paslasiliyor...");
    }
}
