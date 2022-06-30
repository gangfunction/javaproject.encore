package dao.register;


import dto.dTO;
import dto.memberDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberRegister {
    public memberRegister() {
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,true,?)";
        try {
            Connection conn = dTO.getConn();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDTO.getId());
            stmt.setString(2, memberDTO.getPwd());
            stmt.setBoolean(3, memberDTO.getAdmin());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
