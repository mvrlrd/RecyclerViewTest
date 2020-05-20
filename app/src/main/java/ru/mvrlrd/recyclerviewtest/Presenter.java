package ru.mvrlrd.recyclerviewtest;

import java.util.List;

public class Presenter {
    Model model;

    public Presenter() {
        this.model = new Model();
    }

    public List<String> getList() {
        return model.getList();
    }
}
