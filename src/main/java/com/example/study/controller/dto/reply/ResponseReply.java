package com.example.study.controller.dto.reply;

import com.example.study.domain.reply.Reply;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResponseReply {

    private String content;
    private String writer;

    public ResponseReply(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }


    public static ResponseReply of(Reply reply){
        return new ResponseReply(reply.getContent(), reply.getWriter());
    }

}
