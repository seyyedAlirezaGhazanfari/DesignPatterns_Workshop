package patterns.Builder;

import patterns.Team;

public class EquipmentRequest extends Request{
    private Team team;
    public EquipmentRequest(String id, String authorInfo, boolean isNecessary, String content, Request request, Team team) {
        super(id, authorInfo, isNecessary, content, request);
        this.team = team;
    }
}
