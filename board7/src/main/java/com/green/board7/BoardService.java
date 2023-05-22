package com.green.board7;

import com.green.board7.model.BoardDetailVo;
import com.green.board7.model.BoardDto;
import com.green.board7.model.BoardInsDto;
import com.green.board7.model.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //bean 등록
public class BoardService {
    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public int insBoard(BoardInsDto dto) {
        return mapper.insBoard(dto);

    }

    public List<BoardVo> selBoardAll() {
        return mapper.selBoardAll();
    }

    public BoardDetailVo selBoardById(BoardDto dto) {
        return mapper.selBoardById(dto);
    }

    public int upBoard(BoardDto dto) {
        return mapper.upBoard(dto);
    }

    public int delBoard(BoardDto dto) {
        return mapper.delBoard(dto);
    }


}
