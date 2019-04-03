package com.neuedu.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/3.
 */
public class Student {
    private Integer id;
    private String name;
    private Date date;

    @JSONField(format = "yyyy-MM-dd")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
