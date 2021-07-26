package com.example.study.controller.dto.board;

import com.example.study.domain.board.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateBoard {

    private String title;
    private String content;

    public Board toEntity() {
        return new Board(title, content);
    }

}
