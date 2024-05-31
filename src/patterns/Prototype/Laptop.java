package patterns.Prototype;

import patterns.Prototype.Equipment;

import java.util.Date;

public class Laptop extends Equipment {
    private int ramSize;
    private String ramType;
    private int memSize;
    private String memType;
    private String memBrand;
    private int monitorLen;
    private int monitorWid;

    public Laptop(String id, Date releaseDate, String companyID, String supportCode, int ramSize, int memSize, int monitorLen, int monitorWid, String ramType, String memBrand, String memType) {
        super(id, releaseDate, companyID, supportCode);
        this.memBrand = memBrand;
        this.memType = memType;
        this.memSize = memSize;
        this.ramSize = ramSize;
        this.ramType = ramType;
        this.monitorLen = monitorLen;
        this.monitorWid = monitorWid;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public int getMemSize() {
        return memSize;
    }

    public void setMemSize(int memSize) {
        this.memSize = memSize;
    }

    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public String getMemBrand() {
        return memBrand;
    }

    public void setMemBrand(String memBrand) {
        this.memBrand = memBrand;
    }

    public int getMonitorLen() {
        return monitorLen;
    }

    public void setMonitorLen(int monitorLen) {
        this.monitorLen = monitorLen;
    }

    public int getMonitorWid() {
        return monitorWid;
    }

    public void setMonitorWid(int monitorWid) {
        this.monitorWid = monitorWid;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Laptop(this.getId(), this.getReleaseDate(), this.getCompanyID(), this.getSupportCode(), this.getRamSize(), this.getMemSize(), this.getMonitorLen(), this.getMonitorWid(), this.getRamType(), this.getMemBrand(), this.getMemType());
    }
}
