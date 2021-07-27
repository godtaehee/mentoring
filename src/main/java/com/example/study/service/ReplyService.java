package com.example.study.service;

import com.example.study.controller.dto.reply.ResponseReply;
import com.example.study.controller.dto.reply.UpdateReply;
import com.example.study.controller.dto.reply.WriteReply;
import com.example.study.domain.board.Board;
import com.example.study.domain.reply.Reply;
import com.example.study.repository.BoardRepository;
import com.example.study.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ReplyService{

    private final BoardRepository boardRepository;
    private final ReplyRepository replyRepository;

    @Transactional
    public ResponseReply write(Long id, WriteReply writeReply) {
        Optional<Board> board = boardRepository.findById(id);
        Reply reply = replyRepository.save(writeReply.toEntity(board.get()));
        boardRepository.save(board.get());
        return ResponseReply.of(reply);
    }

    public List<Reply> getReplies(Long id) {
        Optional<Board> board = boardRepository.findById(id);
        return board.get().getReplies();
    }

    @Transactional
    public ResponseReply updateReply(Long id, UpdateReply updateReply) {

        Optional<Reply> reply = replyRepository.findById(id);

        reply.get().update(updateReply);

        return ResponseReply.of(replyRepository.findById(id).get());
    }

    @Transactional
    public ResponseReply deleteBoard(Long id) {
        Reply reply = replyRepository.findById(id).get();
        replyRepository.deleteById(id);
        return ResponseReply.of(reply);
    }
}
