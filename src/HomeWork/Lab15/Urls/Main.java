package HomeWork.Lab15.Urls;

public class Main {
    public static void main(String[] args) {
        Url url = Url.urlBuilder().setHostname("google.com").setSchema("https").setResource("users").build();
        System.out.println(url);

        Url url1 = Url.urlBuilder().setSchema("http").setHostname("yandex.ru").setResource("main").build();
        System.out.println(url1);
    }
}
