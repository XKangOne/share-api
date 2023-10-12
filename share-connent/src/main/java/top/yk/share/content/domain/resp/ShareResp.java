package top.yk.share.content.domain.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.yk.share.content.domain.entity.Share;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShareResp {
    /*
     * 分享内容对象
     * */
    private Share share;
    /*
    * 发布者昵称
    * */
    private String nickname;
    /*
    * 发布者头像
    * */
    private String avatarUrl;
}

