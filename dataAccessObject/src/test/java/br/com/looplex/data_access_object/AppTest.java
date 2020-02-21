package br.com.looplex.data_access_object;

import org.junit.Test;

import br.com.looplex.data_access_object.dao.UserDaoMemoryImpl;
import br.com.looplex.data_access_object.model.User;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testCreate() {

        DataAccessObjectService serv = new DataAccessObjectService(
            new UserDaoMemoryImpl()
        );
        serv.create(new User("user1", "password", "email"));
        assertEquals(
            serv.findById("user1")
            , new User("user1", "password", "email")
        );
    }

    @Test
    public void testFindAll() {

        DataAccessObjectService serv = new DataAccessObjectService(
            new UserDaoMemoryImpl()
        );
        serv.create(new User("user1", "password", "email"));
        serv.create(new User("user2", "password", "email"));
        serv.create(new User("user3", "password", "email"));
        assertEquals(
            serv.findAll()
            , Arrays.asList(
                new User("user1", "password", "email")
                , new User("user2", "password", "email")
                , new User("user3", "password", "email")
            )
        );
    }

    @Test
    public void testUpdate() {

        DataAccessObjectService serv = new DataAccessObjectService(
            new UserDaoMemoryImpl()
        );
        serv.create(new User("user1", "password", "email"));
        serv.create(new User("user2", "password", "email"));
        serv.update(new User("user2", "newPassword", "oldEmail"));
        assertEquals(
            serv.findById("user2")
            , new User("user2", "newPassword", "oldEmail")
        );
    }

    @Test
    public void testDelete() {

        DataAccessObjectService serv = new DataAccessObjectService(
            new UserDaoMemoryImpl()
        );
        serv.create(new User("user1", "password", "email"));
        serv.create(new User("user2", "password", "email"));
        serv.create(new User("user3", "password", "email"));
        serv.delete(new User("user3", "password", "email"));
        assertEquals(
            serv.findAll()
            , Arrays.asList(
                new User("user1", "password", "email")
                , new User("user2", "password", "email")
            )
        );
    }

}
