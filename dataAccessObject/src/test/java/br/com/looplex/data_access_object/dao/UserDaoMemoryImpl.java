package br.com.looplex.data_access_object.dao;

import br.com.looplex.data_access_object.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoMemoryImpl
    implements IDao<User, String> {

    Map<String, User> users = new HashMap<String, User>();

    public void create(User newInstance) {
        users.put(newInstance.getUsername(), newInstance);
    }

    public List<User> findAll() {
        return new ArrayList<User>(users.values());
    }

    public User findById(String id) {
        return users.get(id);
    }

    public User update(User transientObject) {
        users.replace(transientObject.getUsername(), transientObject);
        return users.get(transientObject.getUsername());
    }

    public void delete(User persistentObject) {
        users.remove(persistentObject.getUsername());
    }

}
