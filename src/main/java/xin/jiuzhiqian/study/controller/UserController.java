package xin.jiuzhiqian.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xin.jiuzhiqian.study.entity.User;

import java.util.*;

/**
 * @author : zhou
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @GetMapping("/")
    public List<User> getUserList() {
        return new ArrayList<User>(users.values());
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }
}