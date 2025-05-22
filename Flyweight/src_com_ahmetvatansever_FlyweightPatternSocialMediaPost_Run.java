package com.ahmetvatansever.FlyweightPatternSocialMediaPost;

public class Run {
    public static void main(String[] args) {
        String[] usernames = {"user1", "user2", "user3", "user1"};
        String[] postTexts = {"text1", "test2", "text3", "text1"};
        String[] imageUrls = {"image1.jpg", "image2.jpg", "image3.jpg", "image1.jpg"};

        for (int i = 0; i < usernames.length; i++) {
            String username = usernames[i];
            String text = postTexts[i];
            String imageUrl = imageUrls[i];

            Post post = PostFactory.getPost(username, text, imageUrl);
            post.display();
        }
    }
}
