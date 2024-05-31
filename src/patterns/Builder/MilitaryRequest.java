package patterns.Builder;

import java.util.Date;

public class MilitaryRequest extends Request{
    private Date deadline;
    public MilitaryRequest(String id, String authorInfo, boolean isNecessary, String content, Request request, Date deadline) {
        super(id, authorInfo, isNecessary, content, request);
        this.deadline = deadline;
    }
}
