package com.devglan.service;

import com.devglan.model.Data;

import java.util.List;

public interface DataService {

    Data save(Data data);
    List<Data> findAll();
    Data find(long id);
    void delete(long id);
}
