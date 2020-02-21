package br.com.looplex.data_access_object;

import java.util.List;

import br.com.looplex.data_access_object.dao.IDao;
import br.com.looplex.data_access_object.model.IObject;

public final class DataAccessObjectService {

    IDao dao;

    public DataAccessObjectService(
        IDao dao
    ) {
        this.dao = dao;
    }

    public void create(IObject newInstance) {
        dao.create(newInstance);
    }

    public List<IObject> findAll() {
        return dao.findAll();
    }

    public IObject findById(String id) {
        return dao.findById(id);
    }

    public IObject update(IObject transientObject) {
        return dao.update(transientObject);
    }

    public void delete(IObject persistentObject) {
        dao.delete(persistentObject);
    }

}
