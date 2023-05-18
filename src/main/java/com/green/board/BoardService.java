package com.green.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper) {
        this.mapper = mapper;
    }

    public int insBoard(BoardEntity entity) {
        System.out.println("service-insBoard");
        mapper.insBoard(entity);
        return 1;
    }

    public BoardEntity selBoardById(BoardEntity entity) {
        return mapper.selBoardById(entity);
    }

    public List<BoardEntity> selBoardAll(){
        return mapper.selBoardAll();
    }

    public int upBoard(BoardEntity entity) {
        System.out.println("service-upBoard");
        mapper.upBoard(entity);
        return 1;
    }

    public int delBoard(BoardEntity iboard) {
        return  mapper.delBoard(iboard);
    }
}
