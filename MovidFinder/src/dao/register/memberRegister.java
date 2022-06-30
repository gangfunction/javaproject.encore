package dao.register;


import dto.memberDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberRegister {
    public memberRegister() {
        String sql = "insert into member(id,pwd,isin,admin) values(?,?,true,?)";
        try {
            Connection conn = dto.dto.getConn();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDto.getId());
            stmt.setString(2, memberDto.getPwd());
            stmt.setBoolean(3,memberDto.getAdmin());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
