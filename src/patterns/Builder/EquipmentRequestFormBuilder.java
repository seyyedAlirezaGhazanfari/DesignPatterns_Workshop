package patterns.Builder;

import patterns.Employee;
import patterns.Team;

public class EquipmentRequestFormBuilder implements FormBuilder{
    private boolean isNecessary;
    private Team team;
    private String authorInfo;

    private String content;

    @Override
    public void reset() {
        this.isNecessary = false;
        this.team = null;
        this.authorInfo = null;
        this.content = null;
    }

    @Override
    public void setAuthorInfo(String authorID, String name) {
        this.authorInfo = authorID + "////" + name;
    }

    @Override
    public void setPriority(Employee employee) {
        this.isNecessary = false;
        this.team = employee.getTeam();
    }

    @Override
    public void setContent(String content, String formerRelatedRequest) {
        this.content = content;
    }

    @Override
    public Request build() {
        return new EquipmentRequest("2", authorInfo, isNecessary, content, null, team);
    }
}
