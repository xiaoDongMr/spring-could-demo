package cn.yilucaifu.domain;

public class Parameter {
    private Integer id;

    private String paramname;

    private String paramvalue;

    private String paramflag;

    private String paramdate;

    private Integer paramstatus;

    private String fromip;

    private String firstfrom;

    private String firstad;

    private Integer vailcount;

    private String deviceuuid;

    private String serialid;

    private Integer isvoice;

    private String bankcardno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue == null ? null : paramvalue.trim();
    }

    public String getParamflag() {
        return paramflag;
    }

    public void setParamflag(String paramflag) {
        this.paramflag = paramflag == null ? null : paramflag.trim();
    }

    public String getParamdate() {
        return paramdate;
    }

    public void setParamdate(String paramdate) {
        this.paramdate = paramdate == null ? null : paramdate.trim();
    }

    public Integer getParamstatus() {
        return paramstatus;
    }

    public void setParamstatus(Integer paramstatus) {
        this.paramstatus = paramstatus;
    }

    public String getFromip() {
        return fromip;
    }

    public void setFromip(String fromip) {
        this.fromip = fromip == null ? null : fromip.trim();
    }

    public String getFirstfrom() {
        return firstfrom;
    }

    public void setFirstfrom(String firstfrom) {
        this.firstfrom = firstfrom == null ? null : firstfrom.trim();
    }

    public String getFirstad() {
        return firstad;
    }

    public void setFirstad(String firstad) {
        this.firstad = firstad == null ? null : firstad.trim();
    }

    public Integer getVailcount() {
        return vailcount;
    }

    public void setVailcount(Integer vailcount) {
        this.vailcount = vailcount;
    }

    public String getDeviceuuid() {
        return deviceuuid;
    }

    public void setDeviceuuid(String deviceuuid) {
        this.deviceuuid = deviceuuid == null ? null : deviceuuid.trim();
    }

    public String getSerialid() {
        return serialid;
    }

    public void setSerialid(String serialid) {
        this.serialid = serialid == null ? null : serialid.trim();
    }

    public Integer getIsvoice() {
        return isvoice;
    }

    public void setIsvoice(Integer isvoice) {
        this.isvoice = isvoice;
    }

    public String getBankcardno() {
        return bankcardno;
    }

    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno == null ? null : bankcardno.trim();
    }
}