package com.company;



public class Client {

    public static void main(String[] args) {


        WebPageProxy webPageProxy = new WebPageProxy(); {
        try {
                WebPageProxy.GetPage("www.twitch.tv/raf_iyo");
        }

        catch (Exception e) {
                System.out.println(e.getMessage());
        }
        }
    }

}
