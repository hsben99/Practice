package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import criTest.Criteria;
import jdbcUtil.BoardDAO;
import vo.BoardVO;

@Service
public class BoardServiceImple implements BoardService{
	@Autowired
	BoardDAO dao;

	@Override
	public List<BoardVO> criList(Criteria cri) {
		return dao.criList(cri);
	}

	@Override
	public int total() {

		return dao.total();
	}
	
}