package service;

import java.util.List;

import criTest.SearchCri;
import vo.NBoardVO;
import vo.NCVO;

public interface BoardService {

	public List<NBoardVO> nblist(SearchCri cri);
	

	public int total(SearchCri cri);
	
	public NBoardVO nbdetail(NBoardVO vo);


	public List<NCVO> clist(NBoardVO vo);


	public int nbcinsert(NCVO cvo);


	public int nbdelete(NBoardVO vo);


	public int nbupdate(NBoardVO vo);


	public int nbinsert(NBoardVO vo);


	public int nbcdelete(NCVO cvo);
}