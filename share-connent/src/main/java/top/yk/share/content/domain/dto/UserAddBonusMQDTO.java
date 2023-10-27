package top.yk.share.content.domain.dto;


/*
* UserAddBonusMQDTO:消息队列用户增加积分的传输对象
* */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAddBonusMQDTO {
    private Long userId;
    private Integer bonus;
}
