package top.yk.share.user.domain.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAddBonusMQDTO {
    /*
    * 为谁加积分
    * */
    private Long userId;
    /*
    * 加多少分
    * */
    private Integer bonus;
    /*
    * 描述信息
    * */
    private String description;
    /*
    * 积分事件(签到、投稿、兑换等)
    * */
    private String event;
}
