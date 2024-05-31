package patterns.Prototype;

import java.util.Date;

abstract class Equipment {
    private String id;
    private Date releaseDate;
    private String companyID;
    private String supportCode;
    private Date endDate = null;

    public Equipment(String id, Date releaseDate, String companyID, String supportCode) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.companyID = companyID;
        this.supportCode = supportCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getSupportCode() {
        return supportCode;
    }

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
}
