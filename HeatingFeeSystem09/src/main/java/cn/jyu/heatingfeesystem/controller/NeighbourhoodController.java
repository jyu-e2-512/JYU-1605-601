package cn.jyu.heatingfeesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import cn.jyu.heatingfeesystem.model.NeighbourhoodModel;
import cn.jyu.heatingfeesystem.service.NeighbourhoodService;
import cn.jyu.heatingfeesystem.util.ResultMessage;

/**
 * 模块：Neighbourhood Controller层：年度供热价格控制器Controller类
 * 
 * @author 王得志
 *
 */
@RestController
@RequestMapping(value = "/neighbourhood")
@CrossOrigin
public class NeighbourhoodController {
	@Autowired
	private NeighbourhoodService neighbourhoodService = null;
	
	// 添加小区信息
	@RequestMapping("/add")
	public ResultMessage<NeighbourhoodModel> add(NeighbourhoodModel neighbourhood) {
		System.out.println("AAA");
		neighbourhoodService.insert(neighbourhood);
		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "添加年度供热价格成功");
		result.setModel(neighbourhood);
		return result;
	}

	// 删除小区信息
	@PostMapping("/delete")
	public ResultMessage<NeighbourhoodModel> delete(int hoodNo) {
		neighbourhoodService.delete(hoodNo);
		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "修改年度供热价格成功");
		//result.setModel(hoodNo);
		return result;
	}

	// 修改小区信息
	@PostMapping("/update")
	public ResultMessage<NeighbourhoodModel> update(NeighbourhoodModel neighbourhood) {
		neighbourhoodService.update(neighbourhood);
		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "删除年度供热价格成功");
		result.setModel(neighbourhood);
		return result;

	}

	// 通过编号查询小区信息
	@GetMapping("/get")
	public ResultMessage<NeighbourhoodModel> getByHeatingYear(int hoodNo) {
		NeighbourhoodModel neighbourhood = neighbourhoodService.selectByTypeNo(hoodNo);
		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "通过年份查询年度供热价格成功");
		result.setModel(neighbourhood);
		return result;
	}

	// 查询所有小区信息，无分页
	@GetMapping("/list/all")
	public ResultMessage<NeighbourhoodModel> seleteAll() throws Exception {

		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "查询所有年度供热价格成功，无分页");
		result.setList(neighbourhoodService.selectAll());
		return result;

	}

	// 查询所有小区信息，分页
	@RequestMapping("/list/all/page")
	public ResultMessage<NeighbourhoodModel> seleteAllWithPage(
			@RequestParam(required = false, defaultValue = "10") int rows,
			@RequestParam(required = false, defaultValue = "1") int page) throws Exception {
		ResultMessage<NeighbourhoodModel> result = new ResultMessage<NeighbourhoodModel>("OK", "取得年度供热价格列表分页模式成功");
		result.setCount(neighbourhoodService.selectCountByAll());
		result.setPageCount(neighbourhoodService.getPageCountByAll(rows));
		result.setList(neighbourhoodService.selectListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}

	
}
