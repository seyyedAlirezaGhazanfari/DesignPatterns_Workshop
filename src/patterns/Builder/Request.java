package patterns.Builder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Request {
    private static ArrayList<Request> requests = new ArrayList<>();

    private String id;
    private String authorInfo;
    private boolean isNecessary;
    private String content;
    private Request relatedRequest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Request(String id, String authorInfo, boolean isNecessary, String content, Request request) {
        this.id = id;
        this.authorInfo = authorInfo;
        this.isNecessary = isNecessary;
        this.content = content;
        this.relatedRequest = request;
    }

    public static Request findRequest(String requestID) {
        for (Request request: requests) {
            if (request.getId().equals(requestID)) {
                return request;
            }
        }
        return null;
    }
}
