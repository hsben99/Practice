package com.ncs.green;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import criTest.Criteria;
import criTest.PageMaker;
import service.BoardService;
import vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/criList")
	public ModelAndView criList(ModelAndView mv, Criteria cri, PageMaker pm) {
		
		cri.setSnoEno();
		List<BoardVO> list = service.criList(cri);
		
		mv.addObject("list",list);
		
		list.get(1).getTitle();
		
		pm.setCri(cri);
		pm.setLastPage(service.total());
		mv.addObject("pm", pm);
		
		mv.setViewName("board/criList");
		
		return mv;
	}

}
