package com.coderdream.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 基础数据接口
 */
public interface BaseDao<T> {
    void save(T t);

    void update(T t);

    int delete(Serializable id);

    T findById(Serializable id);

    List<T> findAll();
}