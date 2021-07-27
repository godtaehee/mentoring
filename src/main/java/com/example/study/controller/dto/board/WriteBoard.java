package com.example.study.controller.dto.board;

import com.example.study.domain.board.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class WriteBoard {

    private String title;

    private String content;

    private String writer;

    public Board toEntity() {
        return new Board(title, content, writer);
    }

}
