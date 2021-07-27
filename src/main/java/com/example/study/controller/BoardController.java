package com.example.study.controller;

import com.example.study.controller.dto.board.ResponseBoard;
import com.example.study.controller.dto.board.UpdateBoard;
import com.example.study.controller.dto.board.WriteBoard;
import com.example.study.domain.board.Board;
import com.example.study.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board/write")
    public ResponseBoard write(@RequestBody WriteBoard writeBoard) {
        ResponseBoard responseBoard = boardService.write(writeBoard);
        return responseBoard;
    }

    @GetMapping("/board/list")
    public List<Board> getBoardListUsingPagination(int page) {
        return boardService.getBoardListUsingPagination(page);
    }

    @GetMapping("/board/detail")
    public ResponseBoard getBoardDetail(Long id) {
        return boardService.getBoardDetail(id);
    }

    @PostMapping("/board/update")
    public ResponseBoard update(Long id, @RequestBody UpdateBoard updateBoard) {
        return boardService.updateBoard(id, updateBoard);
    }

    @DeleteMapping("/board/delete")
    public ResponseBoard delete(Long id) {
        return boardService.deleteBoard(id);
    }

}
