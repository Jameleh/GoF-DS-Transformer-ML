public class Browser{
    public static void main(String[] args) {
        WebPageProxy webPageProxy = new WebPageProxy();
        try {
            webPageProxy.renderPage("www.youtube.com");
        } catch (Exception e){
            System.out.println("Exception occurred" + e.getMessage());
            e.printStackTrace();
        }
    }
}

// the net result here is there is a WebPage interface with a method for rendering the page of a requested url.
// there is a real webpage and a proxy web page. the user only gets acceess to the proxy web page where 'youtube' is
//blocked but other urls like work-related sites would be accessible. The user's content is censored but the censored
// content is still available to perhaps the IPS or administrators who are not using the proxy service...