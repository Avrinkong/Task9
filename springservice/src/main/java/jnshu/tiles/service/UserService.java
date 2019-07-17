package jnshu.tiles.service;

import jnshu.tiles.entity.User;
import jnshu.tiles.entity.UserExample;

import java.util.List;

public interface UserService {
    List<User> findUser(UserExample userExample);

    int add(User user);
}
