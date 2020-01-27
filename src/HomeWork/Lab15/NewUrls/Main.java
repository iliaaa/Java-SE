package HomeWork.Lab15.NewUrls;

public class Main {
    public static void main(String[] args) {
        String url = new UrlBuilder("google.com").setResource("users").setScheme("https").build();
        System.out.println(url);

        String url1 = new UrlBuilder("yandex.ru").setScheme("http").setResource("main").build();
        System.out.println(url1);

        UrlBuilder url2 = new UrlBuilder("vk.com");
//        System.out.println(url2.url);
        System.out.println(url2.hashCode());
        url2.setScheme("https");
        System.out.println(url2.hashCode());
        url2.setResource("feed");
        System.out.println(url2.hashCode());
//        System.out.println(url2.url);
        System.out.println(url2.build());


    }
}
