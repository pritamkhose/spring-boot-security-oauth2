package com.devglan.controller;

import com.devglan.model.Data;
import com.devglan.model.User;
import com.devglan.service.DataService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value="/data/{id}", method = RequestMethod.GET)
    public Data getData(@PathVariable(value = "id") Long id){
        return dataService.find(id);
    }
    
    @RequestMapping(value="/data", method = RequestMethod.GET)
    public List<Data> listData(){
        return dataService.findAll();
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public Data create(@RequestBody Data data){
        return dataService.save(data);
    }

    @RequestMapping(value = "/data/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable(value = "id") Long id){
        dataService.delete(id);
        return "success";
    }

}
