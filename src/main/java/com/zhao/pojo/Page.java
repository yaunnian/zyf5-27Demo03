package com.zhao.pojo;

import java.util.List;

public class Page {
    private List<?> rows;
    private int total;
    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
