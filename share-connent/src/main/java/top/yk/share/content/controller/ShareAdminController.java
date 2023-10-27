package top.yk.share.content.controller;


import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import top.yk.share.common.resp.CommonResp;
import top.yk.share.content.domain.dto.ShareAuditDTO;
import top.yk.share.content.domain.entity.Share;
import top.yk.share.content.service.ShareService;

import java.util.List;

@RestController
@RequestMapping("/share/admin")
public class ShareAdminController {

    @Resource
    private ShareService shareService;

    @GetMapping(value = "/list")
    public CommonResp<List<Share>> getSharesNotYet() {
        CommonResp<List<Share>> commonResp = new CommonResp<>();
        commonResp.setData(shareService.querySharesNotYet());
        commonResp.setMessage("1111");
        return commonResp;
    }

    @PostMapping(value = "/audit/{id}")
    public CommonResp<Share> auditById(@PathVariable Long id, @RequestBody ShareAuditDTO auditDTO) {
        CommonResp<Share> commonResp = new CommonResp<>();
        commonResp.setData(shareService.auditById(id,auditDTO));
        return commonResp;
    }
}
