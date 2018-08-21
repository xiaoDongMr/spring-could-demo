package cn.yilucaifu.domain;

public class P2pBanks {
    private Integer id;

    private String bankname;

    private String bankno;

    private String bankpic;

    private String shortname;

    private String maxinvestlimit;

    private String todaymaxinvestlimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getBankno() {
        return bankno;
    }

    public void setBankno(String bankno) {
        this.bankno = bankno == null ? null : bankno.trim();
    }

    public String getBankpic() {
        return bankpic;
    }

    public void setBankpic(String bankpic) {
        this.bankpic = bankpic == null ? null : bankpic.trim();
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getMaxinvestlimit() {
        return maxinvestlimit;
    }

    public void setMaxinvestlimit(String maxinvestlimit) {
        this.maxinvestlimit = maxinvestlimit == null ? null : maxinvestlimit.trim();
    }

    public String getTodaymaxinvestlimit() {
        return todaymaxinvestlimit;
    }

    public void setTodaymaxinvestlimit(String todaymaxinvestlimit) {
        this.todaymaxinvestlimit = todaymaxinvestlimit == null ? null : todaymaxinvestlimit.trim();
    }
}