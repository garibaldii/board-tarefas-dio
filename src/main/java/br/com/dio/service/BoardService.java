package br.com.dio.service;

import br.com.dio.persistence.dao.BoardColumnDAO;
import br.com.dio.persistence.dao.BoardDAO;
import br.com.dio.persistence.entity.BoardEntity;
import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.SQLException;

@AllArgsConstructor
public class BoardService {

    private final Connection connection;


    public boolean delete(final Long id) throws SQLException {
        var dao = new BoardDAO(connection);

        try {
            if (!dao.exists(id)) return false;

            dao.delete(id);
            connection.commit();
            return true;
        } catch (SQLException e) {
            connection.rollback();
            throw e;
        }
    }

    public BoardEntity insert(BoardEntity entity) throws SQLException {

        var dao = new BoardDAO(connection);
        var boardColumnsDAO = new BoardColumnDAO(connection);
        try {
            dao.insert(entity);
            var columns = entity
                    .getBoardColumns()
                    .stream()
                    .map(
                            c -> {
                                c.setBoard(entity);

                                return c;
                            }).toList();

            for (var column : columns) {
                boardColumnsDAO.insert(column);
            }

            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
            throw e;
        }


        return entity;
    }
}
