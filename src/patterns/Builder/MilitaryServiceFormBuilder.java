package patterns.Builder;

import patterns.Singleton.Admin;
import patterns.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MilitaryServiceFormBuilder implements FormBuilder{
    private String requesterDetail;
    private boolean isNecessary;
    private String content;
    private Request formerRequest;

    @Override
    public void reset() {
        this.requesterDetail = null;
        this.isNecessary = false;
        this.content = null;
        this.formerRequest = null;
    }

    @Override
    public void setAuthorInfo(String authorID, String name) {
        this.requesterDetail = authorID + " " + name;
    }

    @Override
    public void setPriority(Employee employee) {
        this.isNecessary = true;
        Admin.getInstance().notifyAdminForMilitaryRequest();
    }

    @Override
    public void setContent(String content, String formerRelatedRequest) {
        this.formerRequest = Request.findRequest(formerRelatedRequest);
        this.content = content;
    }

    @Override
    public Request build() {
        try {
            return new MilitaryRequest("1", requesterDetail, isNecessary, content, formerRequest, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2024"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
