package cn.jyu.heatingfeesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.jyu.heatingfeesystem.model.HouseTypeModel;
import cn.jyu.heatingfeesystem.service.HouseTypeService;
import cn.jyu.heatingfeesystem.util.ResultMessage;

/**
 * 模块：HouseType Controller层：房屋类型控制器Controller类
 * 
 * @author 程利坚
 *
 */
@RestController
@RequestMapping(value="/housetype")
@CrossOrigin
public class HouseTypeController {
	 @Autowired
	private HouseTypeService houseTypeService = null;

	// 添加房屋类型
	@RequestMapping("/add")
	public ResultMessage<HouseTypeModel> add(HouseTypeModel houseType) {
		System.out.println("AAA");
		houseTypeService.insert(houseType);
		ResultMessage<HouseTypeModel> result = new ResultMessage<HouseTypeModel>("OK", "添加房屋类型成功");
		result.setModel(houseType);
		return result;
		
		
	}

	// 删除房屋类型
	@PostMapping("/delete")
	public ResultMessage<HouseTypeModel> delete(HouseTypeModel houseType) {
		houseTypeService.delete(houseType);
		ResultMessage<HouseTypeModel> result = new ResultMessage<HouseTypeModel>("OK", "删除房屋类型成功");
		result.setModel(houseType);
		return result;
	}

	// 修改房屋类型
	@PostMapping("/update")
	public ResultMessage<HouseTypeModel> update(HouseTypeModel houseType) {
		houseTypeService.update(houseType);
		ResultMessage<HouseTypeModel> result = new ResultMessage<HouseTypeModel>("OK", "修改房屋类型成功");
		result.setModel(houseType);
		return result;
	}
	
	// 通过年份查询年度供热价格
	@GetMapping("/get")
	public ResultMessage<HouseTypeModel> getByTypeNo(int typeNo) {
		HouseTypeModel houseType = houseTypeService.selectByTypeNo(typeNo);
		ResultMessage<HouseTypeModel> result = new ResultMessage<HouseTypeModel>("OK", "通过编号查询房屋类型成功");
		result.setModel(houseType);
		return result;
	}

	// 查询所有房屋类型，无分页
	@GetMapping("/list/all")
	public ResultMessage<HouseTypeModel> seleteAll() {
		ResultMessage<HouseTypeModel> result = new ResultMessage<HouseTypeModel>("OK", "查询所有房屋类型成功，无分页");
		result.setList(houseTypeService.selectAll());
		return result;
	}

	// 查询所有房屋类型，分页
	@RequestMapping("/list/all/page")
	public ResultMessage<HouseTypeModel> seleteAllWithPage(
			@RequestParam(required = false,defaultValue ="10") int rows,
			@RequestParam(required = false,defaultValue = "1") int page) throws Exception {
		ResultMessage<HouseTypeModel> result=new ResultMessage<HouseTypeModel>("OK","取得房屋类型列表分页模式成功");
		result.setCount(houseTypeService.selectCountByAll());
		result.setPageCount(houseTypeService.getPageCountByAll(rows));
		result.setList(houseTypeService.selectListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);
		return result;
	}
}
