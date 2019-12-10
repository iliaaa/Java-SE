package HomeWork.Lab15.NewUrls;

public class Url {
    private String schema = "http";
    public static String hostname;
    private String resource = "";

    public String getSchema() {
        return schema;
    }


    public String getResource() {
        return resource;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return schema + "://" + hostname + "/" + resource;
    }
}
