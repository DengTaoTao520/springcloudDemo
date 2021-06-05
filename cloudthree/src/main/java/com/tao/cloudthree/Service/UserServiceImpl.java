package com.tao.cloudthree.Service;

import com.tao.cloudthree.Mapper.Usermapper;
import com.tao.cloudthree.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
     Usermapper usermapper;

    @Override
    public User selectById(Long id) {
        return usermapper.selectById(id);
    }

    @Override
    public void insert() {
        usermapper.insert();
    }

    @Override
    public void delete() {
        usermapper.delete();
    }

    @Override
    public void deletefirst() {
        usermapper.deletefirst();
    }

    @Override
    public void addEmps(List<User> emps) {
        usermapper.addEmps(emps);
    }

    @Override
    public void addusers(List<User> users) {
        usermapper.addusers(users);
    }

    @Override
    public void adduser(User user) {

        usermapper.adduser(user.getUsername(),user.getPassword());
    }
}
