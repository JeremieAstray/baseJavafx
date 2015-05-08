package com.jeremie.baseJavafx.dao;

import com.jeremie.baseJavafx.bean.Foo;
import org.springframework.stereotype.Repository;

/**
 * Created by jeremie on 15/5/8.
 */
@Repository
public interface FooDAO {
    public Foo findFooById(int id);
}
