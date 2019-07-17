package jnshu.tiles.entity;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class CodeNumber implements Serializable {
    private static final long serialVersionUID = -6826688658028189988L;
    private long time;

    private Integer number;

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
