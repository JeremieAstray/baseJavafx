package com.jeremie.baseJavafx.service.impl;

import com.jeremie.baseJavafx.bean.Foo;
import com.jeremie.baseJavafx.dao.FooDAO;
import com.jeremie.baseJavafx.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jeremie on 15/5/8.
 */
@Service("fooService")
public class FooServiceImpl implements FooService{
    @Autowired
    private FooDAO fooDAO;

    @Override
    public Foo findFooById(int id) {
        return fooDAO.findFooById(id);
    }
}
