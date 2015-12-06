package com.yang.sac.request.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.yang.sac.tools.HttpTools;
import com.yang.sac.tools.HttpTools.HTTP_REQ_METHOD;

public class HttpRequestDemo
{
	public static void main(String[] args)
	{
		 loginDFCF();
		
	}

	private static void loginDFCF()
	{
		HttpTools httpToolKit = new HttpTools("http://passport.eastmoney.com/ajax/lg.aspx",
				"passport.eastmoney.com");
		
		httpToolKit.setUserAgent("Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/34.0.1847.137 Safari/537.36");
		httpToolKit.setOrigin("http://passport.eastmoney.com");
		httpToolKit.setReferer("http://passport.eastmoney.com/Login.aspx");
		
		Map<String, String> params = new LinkedHashMap<String, String>();
		
		params.put("vcode", "");		
		params.put("u", "playboyfa");
		params.put("p", "111111");
		params.put("r", "0.3352995025925338");

		
		String page = httpToolKit.Execute(params, HTTP_REQ_METHOD.REQ_POST);
		
		System.out.println(page);
	}

	private static void addMyStock(String code)
	{
		HttpTools httpToolKit = new HttpTools(
				"http://mystock.eastmoney.com/mystock.aspx",
				"mystock.eastmoney.com");

		Map<String, String> params = new HashMap<String, String>();
		params.put("f", "as");
		params.put("g", "53903426");
		params.put("sc", code);
		params.put("cb", "addhandlerCallback");

		httpToolKit
				.setCookie("emstat_bc_emcount=36857550451346989242; pu=playboyfa; funcName=CTALL; jumpToDgtl=false; pgv_pvi=3321027590; pgv_info=ssi=s5000955352; emhq_stock=300379%2C510300%2C300059; VerifyCode=key=004313193945&gps=222.73.55.92&validate=4AE4890719AABCBA; emstat_ss_emcount=118_1439686070_2817714419; pi=3597094396569968%3bm3597094396569968%3bplayboyfa5%3bP7kCzJPQPD4K5rCAt6BfISfqSw90mG%2bUXYyT2VflS8cfxt0Cr%2b1QaqfC6A8%2b%2b%2f8%2f%2fi1ktBdRJ24JjVwq7ugLBdKKDUkjqPV25UGikVBvIJUqwADe0r8bdVVh99hHhyq1LSgLDgi62Z8E4eVDx0BP4uIJN0bJAquhP%2bDZ9SE6uLxrgtiZzx5clONtIj%2fS2f%2b4sYaSq5xX%3bJfjzcQtfdqEKs72BYEbu528zCtg1k4KqnSbYv6Scm0soi2pYB9mM7PXCQ%2bsL8V7Ia%2fNpuW6VdS63ZrtMvyfI8fsp7cSDJnlF%2frWjhALJmi%2frFU11EBOy9GZTydKnTKVkDy9cjmLKV3k1iBYF1eCnT%2f9OTwUhbA%3d%3d");
		String page = httpToolKit.Execute(params, HTTP_REQ_METHOD.REQ_GET);

		System.out.println(page);
	}

	private static void getAllStockInfo()
	{
		String requestUrl = "http://quotes.money.163.com/hs/service/diyrank.php";

		Map<String, String> params = new HashMap<String, String>();
		params.put("host", "http://quotes.money.163.com/hs/service/diyrank.php");
		params.put("page", "0");
		params.put("query", "STYPE:EQA");
		params.put("fields",
				"NO,SYMBOL,NAME,PRICE,PERCENT,OPEN,YESTCLOSE,HIGH,LOW,HS,ZF,PE,CODE");
		params.put("sort", "PERCENT");
		params.put("order", "desc");
		params.put("count", "24");
		params.put("type", "query");

		HttpTools httpToolKit = new HttpTools(
				"http://quotes.money.163.com/hs/service/diyrank.php",
				"quotes.money.163.com");

		String page = httpToolKit.Execute(params, HTTP_REQ_METHOD.REQ_GET);

		System.out.println(page);

		StockDayInfoStaticsPage o = JSON.parseObject(page,
				StockDayInfoStaticsPage.class);

		int ii = 103;
		Set<String> stockCodeSet = new HashSet<String>();
		do
		{
			params.put("page", String.valueOf(ii));

			page = httpToolKit.Execute(params, HTTP_REQ_METHOD.REQ_GET);

			System.out.println(page);

			try
			{
				StockDayInfoStaticsPage ol = JSON.parseObject(page,
						StockDayInfoStaticsPage.class);
				List<StockDayInfoStatics> list = ol.getList();
				for (StockDayInfoStatics n : list)
				{
					String code = n.getCode();

					String subCode = code.substring(1);

					if ('6' == code.charAt(1))
					{
						subCode += "|01|01";
					} else
					{
						subCode += "|02|01";
					}
					addMyStock(subCode);
					Thread.sleep(100);
				}

				ii++;
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
		} while (ii < o.getPagecount());
	}
}