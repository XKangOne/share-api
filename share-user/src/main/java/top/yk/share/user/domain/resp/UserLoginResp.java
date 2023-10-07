package top.yk.share.user.domain.resp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.yk.share.user.domain.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginResp {
    private User user;
    private String token;
}