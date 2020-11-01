package jdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import criTest.Criteria;
import vo.BoardVO;

@Repository
public class BoardDAO {

	Connection cn;
	PreparedStatement pst;
	ResultSet rs;

	String sql;

	public BoardDAO() {
		try {
			cn = DBConnction.getConecction();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<BoardVO> criList(Criteria cri) {
		List<BoardVO> list = new ArrayList<BoardVO>();
		sql = "select * from ( select b.*, ROW_NUMBER() OVER(order by seq desc)rnum from board b)asd where asd.rnum between ? and ? ";

		try {
			pst = cn.prepareStatement(sql);
			pst.setInt(1, cri.getSno());
			pst.setInt(2, cri.getEno());
			rs = pst.executeQuery();
			while (rs.next()) {
				int seq = rs.getInt(1);
				String id = rs.getString(2);
				String title = rs.getString(3);
				String content = rs.getString(4);
				String regdate = rs.getString(5);
				BoardVO vo = new BoardVO(seq, id, title, content, regdate);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	
	public int total() {
		sql="select count(*) from board";
		try {
			pst=cn.prepareStatement(sql);
			rs = pst.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
