package patterns.Builder;

import patterns.Employee;

public class RequestDirector {
    private FormBuilder builder;

    public RequestDirector(FormBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(FormBuilder newBuilder) {
        this.builder = newBuilder;
    }

    public Request make(Employee employee, String content, String relatedID) {
        this.builder.reset();
        if (this.builder instanceof MilitaryServiceFormBuilder) {
            this.builder.setContent(content, relatedID);
            this.builder.setAuthorInfo(employee.getId(), employee.getName());
            this.builder.setPriority(employee);
        } else if (this.builder instanceof EquipmentRequestFormBuilder) {
            this.builder.setContent(content, null);
            this.builder.setAuthorInfo(employee.getId(), employee.getName());
            this.builder.setPriority(employee);
        }
        return this.builder.build();
    }
}
