package com.yang.sac.request;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yang.sac.request.constants.Constants;
import com.yang.sac.request.dao.MarketStockInfoRealTimeMapper;
import com.yang.sac.request.domain.MarketStockInfoRealTime;
import com.yang.sac.tools.DateTimeTools;
import com.yang.sac.tools.HttpTools;
import com.yang.sac.tools.HttpTools.HTTP_REQ_METHOD;

public class NetSacRequest
{
	private static Logger logger = Logger.getLogger(NetSacRequest.class);
	private static ApplicationContext ctx;
	//资金流向 quotes.money.163.com
	//http://quotes.money.163.com/service/zjlx_chart.html?symbol=002241
	//成交明细
	//http://quotes.money.163.com/service/zhubi_ajax.html?symbol=002241&end=11%3A30%3A00
	public static MarketStockInfoRealTime getPriceRealTimeInfo(String code)
	{
		String cmdCode = "6".equals(code.substring(0, 1)) ? "0" + code: "1" + code;

		HttpTools httpToolKit = new HttpTools(Constants.WY_PRICE_TIME_INFO_PRE + cmdCode, Constants.WY_HOST);
		
		String response = httpToolKit.Execute(new HashMap<String, String>(), HTTP_REQ_METHOD.REQ_GET);

		if (StringUtils.isBlank(response))
		{
			return null;
		}
		
		response = response.substring(response.indexOf('(') + 1, response.indexOf(')'));
		
		MarketStockInfoRealTime info = new MarketStockInfoRealTime();
		
		JSONObject jsonoo = JSON.parseObject(response);
		jsonoo = jsonoo.getJSONObject(cmdCode);
		
		info.setPrice(jsonoo.getDouble("price"));
		info.setPercent(jsonoo.getDouble("percent"));
		info.setOpen(jsonoo.getDouble("open"));
		info.setYestclose(jsonoo.getDouble("yestclose"));
		info.setHigh(jsonoo.getDouble("high"));
		info.setLow(jsonoo.getDouble("low"));
		info.setUpdown(jsonoo.getDouble("updown"));
		info.setVolume(jsonoo.getInteger("volume"));
		info.setTurnover(jsonoo.getDouble("turnover"));
		info.setBidvol1(jsonoo.getDouble("bidvol1"));
		info.setBid1(jsonoo.getDouble("bid1"));
		info.setBidvol2(jsonoo.getDouble("bidvol2"));
		info.setBid2(jsonoo.getDouble("bid2"));
		info.setBidvol3(jsonoo.getDouble("bidvol3"));
		info.setBid3(jsonoo.getDouble("bid3"));
		info.setBidvol4(jsonoo.getDouble("bidvol4"));
		info.setBid4(jsonoo.getDouble("bid4"));
		info.setBidvol5(jsonoo.getDouble("bidvol5"));
		info.setBid5(jsonoo.getDouble("bid5"));
		info.setAskvol1(jsonoo.getDouble("askvol1"));
		info.setAsk1(jsonoo.getDouble("ask1"));
		info.setAskvol2(jsonoo.getDouble("askvol2"));
		info.setAsk2(jsonoo.getDouble("ask2"));
		info.setAskvol3(jsonoo.getDouble("askvol3"));
		info.setAsk3(jsonoo.getDouble("ask3"));
		info.setAskvol4(jsonoo.getDouble("askvol4"));
		info.setAsk4(jsonoo.getDouble("ask4"));
		info.setAskvol5(jsonoo.getDouble("askvol5"));
		info.setAsk5(jsonoo.getDouble("ask5"));
		
		info.setStockCode(jsonoo.getInteger("code"));
		info.setUpdateTime(DateTimeTools.parseDataTime(jsonoo.getString("update")));
			
		return info;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ctx = new FileSystemXmlApplicationContext(
				"/src/main/resource/applicationContext.xml");
	
		Timer timer = new Timer();// 实例化Timer类
		
		timer.schedule(new TimerTask()
		{
			
			private MarketStockInfoRealTimeMapper marketStockInfoRealTimeMapper = (MarketStockInfoRealTimeMapper) ctx
					.getBean("marketStockInfoRealTimeMapper");
			private MarketStockInfoRealTime preinfo;

			public void run()
			{
				try
				{									
					logger.info("start poll info");
					MarketStockInfoRealTime info = getPriceRealTimeInfo("002241");
					
					logger.info("end poll info:" + info.toString());

					try
					{
						if (null == preinfo || (null != preinfo && !preinfo.equals(info)))
						{
							marketStockInfoRealTimeMapper.insert(info);
						}
						preinfo = info;
					}
					catch (Throwable e)
					{
						// logger.error(e);
					}
				} 
				catch (Throwable e)
				{
					logger.error(e);
				}
			}
		}, 1000, 1000);// 1秒
	}
}
