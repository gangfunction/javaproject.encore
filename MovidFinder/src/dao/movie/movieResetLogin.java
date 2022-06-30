package dao.movie;

import dto.dTO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class movieResetLogin {
    protected movieResetLogin() {
        try{
        String sql = "update member set isin = 0";
        PreparedStatement stmt = dTO.getConn().prepareStatement(sql);
        stmt.executeUpdate();
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
}
}
