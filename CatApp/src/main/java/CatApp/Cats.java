package CatApp;

public class Cats {
    static String id;
    static String url;
    String apiKey = "live_ZIexOh7T2wh9t6W9MY8N9IlfZVKOmy9262oMOH2IEE44KcphsvPXsqejwFhOIA9s";
    String image;

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
