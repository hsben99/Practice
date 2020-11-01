package service;

import java.util.List;

import criTest.Criteria;
import vo.BoardVO;

public interface BoardService {

	public List<BoardVO> criList(Criteria cri);
	
	public int total();
}
