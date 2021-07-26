package com.example.study.service;

import com.example.study.controller.dto.board.ResponseBoard;
import com.example.study.controller.dto.board.UpdateBoard;
import com.example.study.controller.dto.board.WriteBoard;
import com.example.study.domain.board.Board;
import com.example.study.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional
    public ResponseBoard write(WriteBoard writeBoard) {
        Board board = boardRepository.save(writeBoard.toEntity());
        ResponseBoard responseBoard = ResponseBoard.of(board);
        return responseBoard;
    }

    @Transactional
    public ResponseBoard getBoardDetail(Long id) {
        Optional<Board> responseBoard = boardRepository.findById(id);
        return ResponseBoard.of(responseBoard.get());
    }

    @Transactional
    public ResponseBoard updateBoard(Long id, UpdateBoard updateBoard) {
        Optional<Board> board = boardRepository.findById(id);
        board.get().update(updateBoard.getTitle(), updateBoard.getContent());
        return ResponseBoard.of(board.get());
    }
}
