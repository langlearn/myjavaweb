package com.mydomain.myproject.dao;

import java.util.List;

/**
 * Created by yang on 2015/10/30.
 */
public interface CommonDao {
    <T> void sava(T entity);
    <T> void remove(T entity);
    <T> void update(T entity);
    <T> T findById(Class<T> entityClass, Integer id);
    <T> List findAll(Class<T> entityclass);
}
