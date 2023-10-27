package top.yk.share.content.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.yk.share.content.enums.AuditStatusEnum;


/*
* ShareAuditDTO: 审核数据传输对象
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShareAuditDTO {
    /*
     * 审核状态：枚举
     * */
    private AuditStatusEnum auditStatusEnum;

    /*
       原因
    * */
    private String reason;
    /*
    * 是否发布显示
    * */
    private Boolean showFlag;
}
