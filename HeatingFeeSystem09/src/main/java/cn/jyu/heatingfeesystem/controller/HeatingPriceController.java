package cn.jyu.heatingfeesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.jyu.heatingfeesystem.model.HeatingPriceModel;
import cn.jyu.heatingfeesystem.service.HeatingPriceService;
import cn.jyu.heatingfeesystem.util.ResultMessage;

/**
 * 模块：HeatingPrice Controller层：年度供热价格控制器Controller类
 * 
 * @author 陈武杰
 *
 */
@RestController
@RequestMapping(value="/heatingprice")
@CrossOrigin
public class HeatingPriceController {
	@Autowired
	private HeatingPriceService heatingPriceService = null;
	

	// 添加年度供热价格
	@RequestMapping("/add")
	public ResultMessage<HeatingPriceModel> add(HeatingPriceModel heatingPrice) {
		System.out.println("AAA");
		heatingPriceService.insert(heatingPrice);
		return new ResultMessage<HeatingPriceModel>("OK", "添加年度供热价格成功");
	}

	// 删除年度供热价格
	@PostMapping("/delete")
	public ResultMessage<HeatingPriceModel> delete(HeatingPriceModel heatingPrice) {
		heatingPriceService.delete(heatingPrice);
		return new ResultMessage<HeatingPriceModel>("OK", "删除年度供热价格成功");
	}

	// 修改年度供热价格
	@PostMapping("/update")
	public ResultMessage<HeatingPriceModel> update(HeatingPriceModel heatingPrice) {
		heatingPriceService.update(heatingPrice);
		return new ResultMessage<HeatingPriceModel>("OK", "修改年度供热价格成功");
	}

	// 查询所有年度供热价格，无分页
	@GetMapping("/list/all")
	public ResultMessage<HeatingPriceModel> seleteAll() throws Exception {
		heatingPriceService.selectAll();
		System.out.println(heatingPriceService.selectAll().size());
		System.out.println(heatingPriceService.selectCountByAll());
		return new ResultMessage<HeatingPriceModel>("OK", "查询所有年度供热价格成功，无分页");
	}

	// 查询所有年度供热价格，分页
	@RequestMapping("/list/all/page")
	public ResultMessage<HeatingPriceModel> seleteAllWithPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception {
		ResultMessage<HeatingPriceModel> result=new ResultMessage<HeatingPriceModel>("OK","取得年度供热价格列表分页模式成功");
		result.setCount(heatingPriceService.selectCountByAll());
		result.setPageCount(heatingPriceService.getPageCountByAll(rows));
		result.setList(heatingPriceService.selectListByAllWithPage(rows, page));
		result.setPage(page);
		result.setRows(rows);		
		return result;
	}
}
