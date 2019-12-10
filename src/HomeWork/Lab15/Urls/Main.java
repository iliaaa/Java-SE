package HomeWork.Lab15.Urls;

public class Main {
    public static void main(String[] args) {
        String url = Url.urlBuilder().setHostname("google.com").setSchema("https").setResource("users").build();
        System.out.println(url);
    }
}
