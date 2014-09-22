package com.imawsom.poivel.beans;

import java.util.List;

public class Record {
    private String name;
    private String type;
    private List<RepeatableFields> repeatableFieldsList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<RepeatableFields> getRepeatableFieldsList() {
        return repeatableFieldsList;
    }

    public void setRepeatableFieldsList(List<RepeatableFields> repeatableFieldsList) {
        this.repeatableFieldsList = repeatableFieldsList;
    }
}
