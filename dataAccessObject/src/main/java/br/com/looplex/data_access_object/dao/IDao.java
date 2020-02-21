package br.com.looplex.data_access_object.dao;

import java.io.Serializable;
import java.util.List;

import br.com.looplex.data_access_object.model.IObject;

public interface IDao<T extends IObject, PK extends Serializable> {

    void create(T newInstance);

    List<T> findAll();

    T findById(PK id);

    T update(T transientObject);

    void delete(T persistentObject);
}
