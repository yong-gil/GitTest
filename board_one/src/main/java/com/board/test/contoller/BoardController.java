package com.board.test.contoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.test.dto.BoardDto;
import com.board.test.service.BoardService;

@Controller
public class BoardController {

	@Resource(name = "service")
	private BoardService boardService;
	
	//dto 사용 안할때 쓰는 방법
	@RequestMapping("/list")
	public String list(Model model,Map<String,Object> map,
			@RequestParam(value = "page",defaultValue = "1",required = false)int page){
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = boardService.list(map,page);
		int paging = boardService.listCount();
		model.addAttribute("list", list);
		model.addAttribute("paging",paging);
		return "board/board";
	}
	
	@RequestMapping(value = "/listAll",method = RequestMethod.GET)
	public String listAll(Model model,@RequestParam(value = "page",defaultValue = "1",required = false)int page) {
		List<BoardDto> dtos = boardService.listAll(page);
		int paging = boardService.listCount();
		model.addAttribute("list", dtos);
		model.addAttribute("paging",paging);
		return "board/board";
	}
	
	@RequestMapping(value = "selectOne",method = RequestMethod.GET)
	public String selectOne(@RequestParam("boardNum") int boardNum,Model model){
		BoardDto list = new BoardDto();
		System.out.println("boardNum="+boardNum);
		list = boardService.listOne(boardNum);
		model.addAttribute("list", list);
		return "board/boardOne";
	}
	
	@RequestMapping("writeForm")
	public String writeForm() {
		return "board/writeForm";
	}
	
	@RequestMapping("/write")
	public @ResponseBody String AjaxTest(@RequestParam("writer") String writer,@RequestParam("title") String title,
			@RequestParam("content") String content) {
		String msg;
		if(writer.equals("") || title.equals("")|| content.equals("")) {
			msg = "no";
		}else {
			msg = "yes";
			boardService.insert(writer, title, content);
		}
		return msg;
	}
}
