package HomeWork.Lab15.NewUrls;

public class UrlBuilder {
    private Url url;

    public UrlBuilder(String hostname) {
        Url.hostname = hostname;
        url = new Url();
    }

    public UrlBuilder setScheme(String scheme) {
        url.setSchema(scheme);
        return this;
    }

    public UrlBuilder setResource(String resource) {
        url.setResource(resource);
        return this;
    }

    public String build() {
        return url.toString();
    }
}
