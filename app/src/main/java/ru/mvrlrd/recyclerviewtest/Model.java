package ru.mvrlrd.recyclerviewtest;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<String> list;

    public Model() {
        this.list = new ArrayList<>();

        list.add("кошка");
        list.add("собака");
        list.add("жираф");
        list.add("птица");
        list.add("тигр");
        list.add("лев");
        list.add("кит");
        list.add("дельфин");
        list.add("акула");
        list.add("змея");
        list.add("панголин");
        list.add("росомаха");

    }

    public List<String> getList() {
        return list;
    }
}
