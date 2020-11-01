package jdbcUtil;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.BoardVO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;

	static final String NS = "com.ncs.memberMapper.";

	public List<BoardVO> blist() {
		return sqlSession.selectList(NS + "selectList");
	}

}
