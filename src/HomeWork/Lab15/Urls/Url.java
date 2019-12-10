package HomeWork.Lab15.Urls;

public class Url {
    private String schema = "http";
    private static String hostname;
    private String resource = "";

    private Url() {

    }

    public String getSchema() {
        return schema;
    }

    public String getResource() {
        return resource;
    }

    public static String getHostname() {
        return hostname;
    }

    public static UrlBuilder urlBuilder() {
        return new Url().new UrlBuilder();
    }

    public class UrlBuilder {

        public UrlBuilder() {

        }

        public UrlBuilder setSchema(String schema) {
            Url.this.schema = schema;
            return this;
        }

        public UrlBuilder setHostname(String hostname) {
            Url.this.hostname = hostname;
            return this;
        }

        public UrlBuilder setResource(String resource) {
            Url.this.resource = resource;
            return this;
        }

        public String build() {
            return schema + "://" + hostname + "/" + resource;
        }

    }
}
