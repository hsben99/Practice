package com.portal.projt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import criTest.PageMaker;
import criTest.SearchCri;
import service.BoardService;
import vo.NBoardVO;
import vo.NCVO;

@Controller
public class Cont {
	@Autowired
	BoardService service;

	@RequestMapping(value = "/nblist")
	public ModelAndView nblist(ModelAndView mv, SearchCri cri, PageMaker pm) {
		cri.setSnoEno();
		mv.addObject("list", service.nblist(cri));
		pm.setCri(cri);// �ٲ������� ������ ������ �ִ� cri �� pm�� �־��ִ°�
		pm.setLastPage(service.total(cri));
		mv.addObject("pm", pm);
		mv.setViewName("board/noticeBoardList");
		return mv;
	}

	@RequestMapping(value = "/nbdetail")
	public ModelAndView nbdetail(ModelAndView mv, NBoardVO vo, NCVO cvo) {
		vo = service.nbdetail(vo);

		mv.addObject("clist", service.clist(vo));
		mv.addObject("vo", vo);
		mv.setViewName("board/noticeBoardDetail");
		return mv;
	}

	@RequestMapping(value = "/nbcinsert")
	public ModelAndView nbcinsert(ModelAndView mv, NCVO cvo, NBoardVO vo) {
		System.out.println(cvo);
		System.out.println(vo);  

		service.nbcinsert(cvo);
		mv.setViewName("redirect:/nbdetail?seq=" + cvo.getSeq());
		return mv;
	}
	@RequestMapping(value = "/nbcdelete")
	public ModelAndView nbcdelete(ModelAndView mv, NCVO cvo) {
		
		service.nbcdelete(cvo);
		mv.setViewName("redirect:/nbdetail?seq=" + cvo.getSeq());
		return mv;
	}
	
	@RequestMapping(value = "/nbdelete")
	public ModelAndView nbdelete(ModelAndView mv, NBoardVO vo) {
		
		service.nbdelete(vo);
		
		mv.setViewName("redirect:/nblist");
		return mv;
	}
	
	@RequestMapping(value = "/nbupdatef")
	public ModelAndView nbupdatef(ModelAndView mv, NBoardVO vo) {
		mv.addObject("vo",vo);
		vo = service.nbdetail(vo);
		mv.addObject("vo",vo);
		mv.setViewName("board/noticeBoardUpdatef");
		return mv;
	}
	@RequestMapping(value = "/nbupdate")
	public ModelAndView nbupdate(ModelAndView mv, NBoardVO vo) {
		
		service.nbupdate(vo);
		
		mv.setViewName("redirect:/nblist");
		return mv;
	}
	
	@RequestMapping(value = "/nbinsertf")
	public ModelAndView nbinsertf(ModelAndView mv, NBoardVO vo) {
		mv.setViewName("board/noticeBoardInsert");
		return mv;
	}
	@RequestMapping(value = "/nbinsert")
	public ModelAndView nbinsert(ModelAndView mv, NBoardVO vo) {
		service.nbinsert(vo);
		mv.setViewName("redirect:/nblist");
		
		return mv;
	}
	
}
