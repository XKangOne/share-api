package top.yk.share.content.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.yk.share.common.resp.CommonResp;
import top.yk.share.content.domain.entity.Notice;
import top.yk.share.content.service.NoticeService;


@RestController
@RequestMapping(value = "/share")
public class ShareController {
    @Resource
    private NoticeService noticeService;

    @GetMapping(value = "/notice")
    public CommonResp<Notice> getLatestNotice(){
        CommonResp<Notice> commonResp = new CommonResp<>();
        commonResp.setData(noticeService.getLatest());
        return commonResp;
    }
}
