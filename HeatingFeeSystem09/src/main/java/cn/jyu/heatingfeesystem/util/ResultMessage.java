package cn.jyu.heatingfeesystem.util;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
/*
 * 模块：公共基础工具类，
 * 公共的控制层结果返回类，推荐控制层方法增加，修改，删除，取得分页的信息都可以返回此对象
 * @Author: 陈武杰
 */
@Data
public class ResultMessage<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private T model=null; //业务对象
	private List<T> list=null; //业务对象的列表
	private String status=null;
	private String message=null;
	private int rows=0; //每屏显示的行数
	private int page=0; //第几页
	private int count=0; //信息T的个数
	private int pageCount=0; //页数
	
	public ResultMessage() {
		
	}
	public ResultMessage(String status,String message) {
		this.status=status;
		this.message=message;
	}
	public T getModel() {
		return model;
	}
	public void setModel(T model) {
		this.model = model;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
