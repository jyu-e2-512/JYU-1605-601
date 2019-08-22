package cn.jyu.heatingfeesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.jyu.heatingfeesystem.model.PaymentTypeModel;
import cn.jyu.heatingfeesystem.service.PaymentTypeService;
import cn.jyu.heatingfeesystem.util.ResultMessage;
import lombok.Data;

/**
 * 模块：PaymentType控制层：通过view层参数，获取相对应的数据
 * 
 * @author 刁为进
 *
 */
@RestController
@RequestMapping("/paymenttype")
@CrossOrigin
@Data
public class PaymentTypeController
{
	@Autowired
	private PaymentTypeService paymentTypeService;
	
	// 分页查询所有付款方式。
	@PostMapping("/list/all/page")
	public ResultMessage<PaymentTypeModel> seleteAllWithPage(@RequestParam(required = false,defaultValue ="10") int rows,@RequestParam(required = false,defaultValue = "1") int page) throws Exception 
	{
		ResultMessage<PaymentTypeModel> result=new ResultMessage<PaymentTypeModel>("OK","取得年度供热价格列表分页模式成功");
		result.setCount(paymentTypeService.selectCountByAll());
		result.setList(paymentTypeService.selectListByAllWithPage(rows, page));
		result.setPageCount(paymentTypeService.getPageCountByAll(rows));
		result.setPage(page);
		result.setRows(rows);	
		System.out.println(paymentTypeService==null);
		System.out.println("mmp");
		return result;
	}
	
	// 添加付款方式。
	@GetMapping("/add")
	public ResultMessage<PaymentTypeModel> add(PaymentTypeModel paymentType) 
	{
		paymentTypeService.insert(paymentType);
		return new ResultMessage<PaymentTypeModel>("OK", "添加年度供热价格成功");
	}
	
	// 删除年度供热价格
	@GetMapping("/delete")
	public ResultMessage<PaymentTypeModel> delete(PaymentTypeModel paymentType)
	{
		paymentTypeService.delete(paymentType);
		return new ResultMessage<PaymentTypeModel>("OK", "删除年度供热价格成功");
	}

	// 修改年度供热价格
	@GetMapping("/update")
	public ResultMessage<PaymentTypeModel> update(PaymentTypeModel paymentType)
	{
		paymentTypeService.update(paymentType);
		return new ResultMessage<PaymentTypeModel>("OK", "修改年度供热价格成功");
	}
}
