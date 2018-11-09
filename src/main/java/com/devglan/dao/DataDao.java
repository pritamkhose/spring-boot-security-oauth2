package com.devglan.dao;

import com.devglan.model.Data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDao extends CrudRepository<Data, Long> {

}
