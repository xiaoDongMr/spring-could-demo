package cn.yilucaifu.domain;

public class ContentFloorProduct {
    private Integer id;

    private Integer floorId;

    private Integer weight;

    private Byte status;

    private Byte type;

    private Integer productId;

    private Integer productType;

    private String newRecommend;

    private Byte isCarousel;

    private String productImg;

    private Integer carouselTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public String getNewRecommend() {
        return newRecommend;
    }

    public void setNewRecommend(String newRecommend) {
        this.newRecommend = newRecommend == null ? null : newRecommend.trim();
    }

    public Byte getIsCarousel() {
        return isCarousel;
    }

    public void setIsCarousel(Byte isCarousel) {
        this.isCarousel = isCarousel;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg == null ? null : productImg.trim();
    }

    public Integer getCarouselTime() {
        return carouselTime;
    }

    public void setCarouselTime(Integer carouselTime) {
        this.carouselTime = carouselTime;
    }
}