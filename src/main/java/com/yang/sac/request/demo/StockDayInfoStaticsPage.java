package com.yang.sac.request.demo;

import java.util.List;

public class StockDayInfoStaticsPage{
   	private int count;
   	private List<StockDayInfoStatics> list;
   	private String order;
   	private int page;
   	private int pagecount;
   	private String time;
   	private int total;

 	public int getCount(){
		return this.count;
	}
	public void setCount(int count){
		this.count = count;
	}
 	public List<StockDayInfoStatics> getList(){
		return this.list;
	}
	public void setList(List<StockDayInfoStatics> list){
		this.list = list;
	}
 	public String getOrder(){
		return this.order;
	}
	public void setOrder(String order){
		this.order = order;
	}
 	public int getPage(){
		return this.page;
	}
	public void setPage(int page){
		this.page = page;
	}
 	public int getPagecount(){
		return this.pagecount;
	}
	public void setPagecount(int pagecount){
		this.pagecount = pagecount;
	}
 	public String getTime(){
		return this.time;
	}
	public void setTime(String time){
		this.time = time;
	}
 	public int getTotal(){
		return this.total;
	}
	public void setTotal(int total){
		this.total = total;
	}
}
