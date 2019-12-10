package HomeWork.Lab15.NewUrls;

public class Main {
    public static void main(String[] args) {
        String url = new UrlBuilder("google.com").setResource("users").setScheme("https").build();
        System.out.println(url);

        String url1 = new UrlBuilder("yandex.ru").setScheme("http").setResource("main").build();
        System.out.println(url1);
    }
}
