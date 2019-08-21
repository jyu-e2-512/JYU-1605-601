package cn.jyu.heatingfeesystem.controller;


import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.jyu.heatingfeesystem.model.NeighbourhoodModel;
import cn.jyu.heatingfeesystem.service.HeatingPriceService;
import cn.jyu.heatingfeesystem.service.NeighbourhoodService;
import cn.jyu.heatingfeesystem.service.impl.NeighbourhoodServiceImpl;

@RestController
@RequestMapping("/neighbourhood")
public class NeighbourhoodController {
	// @Autowired
	private NeighbourhoodService neighbourhoodService = null;
	
	//添加小区信息
	@RequestMapping(value="insert")
	public void insert(NeighbourhoodModel neighbourhood) {
		neighbourhoodService.insert(neighbourhood);
	}
	//删除小区信息
	@RequestMapping(value="delete")
	public void delete(int hooddNo) {
		neighbourhoodService.delete(hooddNo);
	}
	//修改小区信息
	@RequestMapping(value="update")
	public void update(NeighbourhoodModel neighbourhood) {
		neighbourhoodService.update(neighbourhood);
	}
	//查询所有小区信息
	
	@ResponseBody
	@RequestMapping(value="selectAll")
	public List<NeighbourhoodModel> selectAll(){
		List<NeighbourhoodModel> neighbourhoods=neighbourhoodService.selectAll();
		return neighbourhoods;
		
	}
	
	//通过编号查询小区信息
	@RequestMapping(value="selectByTypeNo")
		public NeighbourhoodModel selectByTypeNo(int hooddNo) {
			NeighbourhoodModel neighbourhood=neighbourhoodService.selectByTypeNo(hooddNo);
			return neighbourhood;
		}
}
