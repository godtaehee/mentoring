package com.example.study.domain.board;

import com.example.study.domain.reply.Reply;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "board")
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String content;

    private String writer;

    private int viewCount;

    private String secretYn;

    private String deleteYn;

    private LocalDateTime insertTime;

    private LocalDateTime updateTime;

    private LocalDateTime deleteTime;

    @OneToMany(mappedBy = "board", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Reply> replies;


    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
