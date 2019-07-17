package jnshu.tiles.service.impl;

import jnshu.tiles.dao.UserMapper;
import jnshu.tiles.entity.User;
import jnshu.tiles.entity.UserExample;
import jnshu.tiles.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
   /* @Cacheable(value = "aboutUser")*/
    public List<User> findUser(UserExample userExample) {
        return userMapper.selectByExample(userExample);
    }

    @Override
    /*@CacheEvict(value= "aboutUser", allEntries=true)*/
    public int add(User user) {
        int i = userMapper.insertSelective(user);
        return i;
    }


}
