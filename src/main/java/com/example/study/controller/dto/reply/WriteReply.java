package com.example.study.controller.dto.reply;

import com.example.study.domain.board.Board;
import com.example.study.domain.reply.Reply;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WriteReply {

    private String content;
    private String writer;

    public Reply toEntity(Board board) {
        return new Reply(content, writer, board);
    }
}
