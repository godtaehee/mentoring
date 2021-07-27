package com.example.study.controller.dto.board;

import com.example.study.domain.board.Board;
import com.example.study.domain.reply.Reply;
import lombok.Getter;

import java.util.List;

@Getter
public class ResponseBoard {

    private String title;
    private String content;
    private String writer;

    public ResponseBoard(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public static ResponseBoard of(Board board) {
        return new ResponseBoard
                (
                        board.getTitle(),
                        board.getContent(),
                        board.getWriter()
                );
    }

}
