package com.ahmetvatansever.FlyweightPatternSocialMediaPost;

import java.util.HashMap;
import java.util.Map;

public class PostFactory {
    private static final Map<String, Post> postMap = new HashMap<>();

    public static Post getPost(String username, String text, String imageUrl){
        String key = username + "_" + text + "_" + imageUrl;
        Post post = postMap.get(key);
        System.out.println("------------ " + key + " ------------");
        if (post == null) {
            System.out.println("Post bulunamadi.");
            post = new SharedPost(username, text, imageUrl);
            postMap.put(key, post);
            System.out.println("Post olusturuldu.");
        }
        return post;
    }
}
