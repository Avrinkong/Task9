package jnshu.tiles.entity;

import java.io.Serializable;

public class Profession implements Serializable {
    private static final long serialVersionUID = -3231725470514605104L;
    private Long id;

    private String img;

    private String direction;

    private String profession;

    private String description;

    private String threshold;

    private String difficulty;

    private String growth;

    private Integer scarcity;

    private String yearone;

    private String yeartwo;

    private String yearthree;

    private Integer learnpeople;

    private Long createat;

    private Long updateat;

    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getGrowth() {
        return growth;
    }

    public void setGrowth(String growth) {
        this.growth = growth;
    }

    public Integer getScarcity() {
        return scarcity;
    }

    public void setScarcity(Integer scarcity) {
        this.scarcity = scarcity;
    }

    public String getYearone() {
        return yearone;
    }

    public void setYearone(String yearone) {
        this.yearone = yearone;
    }

    public String getYeartwo() {
        return yeartwo;
    }

    public void setYeartwo(String yeartwo) {
        this.yeartwo = yeartwo;
    }

    public String getYearthree() {
        return yearthree;
    }

    public void setYearthree(String yearthree) {
        this.yearthree = yearthree;
    }

    public Integer getLearnpeople() {
        return learnpeople;
    }

    public void setLearnpeople(Integer learnpeople) {
        this.learnpeople = learnpeople;
    }

    public Long getCreateat() {
        return createat;
    }

    public void setCreateat(Long createat) {
        this.createat = createat;
    }

    public Long getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Long updateat) {
        this.updateat = updateat;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}