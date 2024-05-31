package patterns.Builder;

import patterns.Employee;

public interface FormBuilder {
    public void reset();
    public void setAuthorInfo(String authorID, String name);
    public void setPriority(Employee employee);
    public void setContent(String content, String formerRelatedRequest);

    public Request build();
}
