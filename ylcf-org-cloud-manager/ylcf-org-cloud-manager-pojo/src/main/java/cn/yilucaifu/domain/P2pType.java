package cn.yilucaifu.domain;

public class P2pType {
    private Integer id;

    private String typecode;

    private String typename;

    private String userno;

    private String outuserno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getOutuserno() {
        return outuserno;
    }

    public void setOutuserno(String outuserno) {
        this.outuserno = outuserno == null ? null : outuserno.trim();
    }
}