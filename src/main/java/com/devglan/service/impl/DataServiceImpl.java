package com.devglan.service.impl;

import com.devglan.dao.DataDao;
import com.devglan.model.Data;
import com.devglan.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service(value = "dataService")
public class DataServiceImpl implements DataService {
	
	@Autowired
	private DataDao dataDao;

	public List<Data> findAll() {
		List<Data> list = new ArrayList<>();
		dataDao.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(long id) {
		dataDao.delete(id);
	}

	@Override
    public Data save(Data data) {
        return dataDao.save(data);
    }

	@Override
	public Data find(long id) {
		// TODO Auto-generated method stub
		Data data = dataDao.findOne(id);
		if(data == null){
			data = null;
		}
		return data;

	}
}
