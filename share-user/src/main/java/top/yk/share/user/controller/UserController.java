package top.yk.share.user.controller;

import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import top.yk.share.common.resp.CommonResp;
import top.yk.share.user.domain.dao.LoginDTO;
import top.yk.share.user.domain.entity.User;
import top.yk.share.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/count")
    public CommonResp<Long> count(){
       Long count = userService.count();
       CommonResp<Long> commonResp = new CommonResp<>();
       commonResp.setDate(count);
        return commonResp;
    }

    @PostMapping("/login")
    public CommonResp<User> login(@Valid  @RequestBody LoginDTO loginDTO) {
        User user = userService.login(loginDTO);
        CommonResp<User> commonResp = new CommonResp<>();
        commonResp.setDate(user);
        return commonResp;
    }
}
