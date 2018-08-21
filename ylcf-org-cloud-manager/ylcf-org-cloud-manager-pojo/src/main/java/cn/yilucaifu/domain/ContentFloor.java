package cn.yilucaifu.domain;

import java.util.Date;

public class ContentFloor {
    private Integer id;

    private String floorName;

    private Integer floorWeight;

    private String floorTypes;

    private Byte floorStatus;

    private Date createtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }

    public Integer getFloorWeight() {
        return floorWeight;
    }

    public void setFloorWeight(Integer floorWeight) {
        this.floorWeight = floorWeight;
    }

    public String getFloorTypes() {
        return floorTypes;
    }

    public void setFloorTypes(String floorTypes) {
        this.floorTypes = floorTypes == null ? null : floorTypes.trim();
    }

    public Byte getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(Byte floorStatus) {
        this.floorStatus = floorStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}