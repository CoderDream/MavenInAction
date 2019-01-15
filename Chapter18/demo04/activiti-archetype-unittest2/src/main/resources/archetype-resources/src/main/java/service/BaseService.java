package ${package}.service;

import java.io.Serializable;
import java.util.List;

/**
 * 基础服务接口
 */
public interface BaseService<T> {
    void save(T t);

    void update(T t);

    int delete(Serializable id);

    T findById(Serializable id);

    List<T> findAll();
}