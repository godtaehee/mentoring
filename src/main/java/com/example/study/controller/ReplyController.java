package com.example.study.controller;

import com.example.study.controller.dto.board.ResponseBoard;
import com.example.study.controller.dto.board.UpdateBoard;
import com.example.study.controller.dto.reply.ResponseReply;
import com.example.study.controller.dto.reply.UpdateReply;
import com.example.study.controller.dto.reply.WriteReply;
import com.example.study.domain.reply.Reply;
import com.example.study.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ReplyController {

    private final ReplyService replyService;

    @PostMapping("/reply/write")
    public ResponseReply write(Long id, @RequestBody WriteReply writeReply) {
        System.out.println(writeReply.getWriter());
        return replyService.write(id, writeReply);
    }

    @GetMapping("/reply/detail")
    public List<Reply> getReplyDetail(Long id) {
        return replyService.getReplies(id);
    }

    @PostMapping("/reply/update")
    public ResponseReply update(Long id, @RequestBody UpdateReply updateReply) {
        return replyService.updateReply(id, updateReply);
    }

    @DeleteMapping("/reply/delete")
    public ResponseReply delete(Long id) {
        return replyService.deleteBoard(id);
    }

}
