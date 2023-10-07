package top.yk.share.user.domain.dao;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginDTO {

    @NotBlank(message = "[手机号] 不能为空")
    public String phone;

    public String password;
}
