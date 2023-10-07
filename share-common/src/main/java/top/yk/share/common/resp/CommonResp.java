package top.yk.share.common.resp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResp<T> {

    /*业务成功或失败*/
    private Boolean success = true;
    private String message;
    private T date;
}
