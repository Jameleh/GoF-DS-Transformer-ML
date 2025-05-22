package com.company;

public class WebPageProxy implements WebPage{

    private WebPage webPage = new RealLink();





    public WebPageProxy() {
        WebPage webPage = new RealLink();
    }


    public static void GetPage(String link) throws Exception {
        if (link.equalsIgnoreCase("www.twitch.tv/raf_iyo")){

            throw new Exception(link + " is working.");
        }
            WebPage.GetPage(link);
        }
    }

