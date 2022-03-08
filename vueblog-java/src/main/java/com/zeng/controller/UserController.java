package com.zeng.controller;


import com.zeng.entity.User;
import com.zeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zeng
 * @since 2022-03-04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public Object test(@PathVariable("id") Long id){
        User user = userService.getById(id);
        return user;
    }

    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user){
        return user.toString();
    }
}
