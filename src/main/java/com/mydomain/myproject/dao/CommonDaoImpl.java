package com.mydomain.myproject.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yang on 2015/10/30.
 */
public class CommonDaoImpl extends HibernateDaoSupport implements CommonDao {
    @SuppressWarnings("unchecked")
    @Override
    public <T> List findAll(Class<T> entityclass) {
        String hql = "from "+entityclass.getName()+" as aaa order by aaa.id desc";
        return getHibernateTemplate().find(hql);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T findById(Class<T> entityClass, Integer id) {
        return (T) this.getHibernateTemplate().get(entityClass, id);
    }

    @Override
    public <T> void remove(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Override
    public <T> void sava(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Override
    public <T> void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }
}
