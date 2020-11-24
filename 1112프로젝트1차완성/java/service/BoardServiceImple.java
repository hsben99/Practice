package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import criTest.SearchCri;
import jdbcUtil.BoardDAO;
import vo.NBoardVO;
import vo.NCVO;

@Service
public class BoardServiceImple implements BoardService {
	@Autowired
	BoardDAO dao;
 
	@Override
	public List<NBoardVO> nblist(SearchCri cri) {
		return dao.nblist(cri);
	}

	@Override
	public int total(SearchCri cri) {
		return dao.total(cri);
	}

	@Override
	public NBoardVO nbdetail(NBoardVO vo) {
		return dao.nbdetail(vo);
	}

	@Override
	public List<NCVO> clist(NBoardVO vo) {
		return dao.clist(vo);
	}

	@Override
	public int nbcinsert(NCVO cvo) {
		return dao.nbcinsert(cvo);
	}

	@Override
	public int nbdelete(NBoardVO vo) {
		return dao.nbdelete(vo);
	}

	@Override
	public int nbupdate(NBoardVO vo) {
		return dao.nbupdate(vo);
	}

	@Override
	public int nbinsert(NBoardVO vo) {
		return dao.nbinsert(vo);
	}

	@Override
	public int nbcdelete(NCVO cvo) {
		return dao.nbcdelete(cvo);
	}

}
