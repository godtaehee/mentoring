package com.example.study.domain.reply;

import com.example.study.domain.board.Board;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "reply")
public class Reply {

    @Id
    @GeneratedValue
    private Long id;
    private String content;
    private String writer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Board board;


    public Reply(String content, String writer, Board board) {
        this.content = content;
        this.writer = writer;
        this.board = board;
    }

}
