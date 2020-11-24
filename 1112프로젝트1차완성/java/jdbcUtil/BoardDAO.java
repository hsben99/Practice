package jdbcUtil;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import criTest.SearchCri;
import vo.NBoardVO;
import vo.NCVO;

@Repository
public class BoardDAO {
	@Autowired
	SqlSession sqlSession;
	String NS = "com.ncs.boardMapper.";

	public List<NBoardVO> nblist(SearchCri cri) {
		return sqlSession.selectList(NS + "nblist", cri);
	}

	public int total(SearchCri cri) {
		return sqlSession.selectOne(NS + "total", cri);
	}

	public NBoardVO nbdetail(NBoardVO vo) {
		return sqlSession.selectOne(NS + "nbdetail", vo);
	}

	public List<NCVO> clist(NBoardVO vo) {
		return sqlSession.selectList(NS+"clist",vo);
	}

	public int nbcinsert(NCVO cvo) {
		return sqlSession.insert(NS+"nbcinsert",cvo);
	}

	public int nbdelete(NBoardVO vo) {
		return sqlSession.delete(NS+"nbdelete",vo);
	}

	public int nbupdate(NBoardVO vo) {
		return sqlSession.update(NS+"nbupdate", vo);
	}

	public int nbinsert(NBoardVO vo) {
		return sqlSession.insert(NS+"nbinsert",vo);
	}

	public int nbcdelete(NCVO cvo) {
		return sqlSession.delete(NS+"nbcdelete",cvo);
	}

}
