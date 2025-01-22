package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(int id);
    void addUser(User user);
    void deleteUser(User user);
    void editUser(User user);
}
