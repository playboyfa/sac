package com.yang.sac.tools;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;


public class HttpTools
{
	private String requestUrl;
	private String host;
	private String accept;
	private String encode;
	private String acceptEncoding;
	private String acceptLanguage;
	private String connectionkeep;
	private String contentType;
	private String cookie;
	private String userAgent;
	private String origin;
	private String referer;
	
	private CloseableHttpClient httpClient;

	public enum HTTP_REQ_METHOD
	{
		REQ_GET,
		REQ_POST
	};

	public HttpTools()
	{
		init(null, null);
	}

	public HttpTools(String requestUrl, String host)
	{
		init(requestUrl, host);
	}
	
	protected void finalize()
	{
		if (null != httpClient)
		{
			try
			{
				httpClient.close();
			} 
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void init(String requestUrl, String host)
	{
		this.requestUrl = requestUrl;
		this.host = host;
		this.accept = "*/*";
		this.acceptEncoding = "gzip,deflate,sdch";
		this.acceptLanguage = "zh-CN,zh;q=0.8";
		this.connectionkeep = "keep-alive";
		this.encode = "UTF-8";
		this.contentType = "application/x-www-form-urlencoded";
		httpClient = HttpClients.createDefault();
	}
	
	public String Execute(Map<String, String> params, HTTP_REQ_METHOD reqMethod)
	{
		if (HTTP_REQ_METHOD.REQ_GET == reqMethod)
		{
			return get(params);
		}
		
		if (HTTP_REQ_METHOD.REQ_POST == reqMethod)
		{
			return post(params);
		}
		
		return "no request method";
	}
	
	private String get(Map<String, String> params)
	{
		if (null == requestUrl || null == host)
		{
			return null;
		}

		requestUrl += "?";

		Set<String> keySet = params.keySet();
		for (String key : keySet)
		{
			requestUrl += key;
			requestUrl += "=";

			try
			{
				requestUrl += URLEncoder.encode(params.get(key), "UTF-8");
			} catch (UnsupportedEncodingException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			requestUrl += "&";
		}

		HttpGet httpGet = new HttpGet(requestUrl);
		setHttpConfig(httpGet);

		CloseableHttpResponse response = sendRequest(httpClient, httpGet);

		return getResponse(response);
	}

	private void setHttpConfig(HttpRequestBase httpBase)
	{
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(2000).setConnectTimeout(2000).setCookieSpec(CookieSpecs.BROWSER_COMPATIBILITY).build();//设置请求和传输超时时间
		httpBase.setConfig(requestConfig);
		httpBase.addHeader("Host", host);
		httpBase.addHeader("Accept", this.accept);
		httpBase.addHeader("Accept-Encoding", this.acceptEncoding);
		httpBase.addHeader("Accept-Language", this.acceptLanguage);
		httpBase.addHeader("Connection:keep", this.connectionkeep);
		httpBase.addHeader("Content-Type", this.contentType);	
		
		if ( !StringUtils.isBlank(this.cookie) )
		{
			httpBase.addHeader("Cookie", this.cookie);
		}
		
		if ( !StringUtils.isBlank(this.userAgent) )
		{
			httpBase.addHeader("User-Agent", this.userAgent);
		}
		
		if ( !StringUtils.isBlank(this.origin) )
		{
			httpBase.addHeader("Origin", this.origin);
		}
		
		if ( !StringUtils.isBlank(this.referer) )
		{
			httpBase.addHeader("Referer", this.referer);
		}
	}

	private String post(Map<String, String> params)
	{
		if (null == requestUrl || null == host)
		{
			return null;
		}

		HttpPost httpost = new HttpPost(requestUrl);

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();

		Set<Entry<String, String>> entrySet = params.entrySet();
		for (Entry<String, String> entry : entrySet)
		{
			nvps.add( new BasicNameValuePair(entry.getKey(), entry.getValue()) );
		}

		try
		{
			httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
		} 
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}

		setHttpConfig(httpost);
		
		CloseableHttpResponse response = sendRequest(httpClient, httpost);
		
		return getResponse(response);
	}
	
	private CloseableHttpResponse sendRequest(CloseableHttpClient httpclient, HttpUriRequest httpost)
	{
		CloseableHttpResponse response = null;

		try
		{
			response = httpclient.execute(httpost);
		} catch (ClientProtocolException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return response;
	}

	private String getResponse(CloseableHttpResponse response)
	{
		org.apache.http.HttpEntity entity1 = response.getEntity();
		
		try
		{

			if (!StringUtils.isBlank(encode))
			{
				return EntityUtils.toString(entity1,
						Charset.forName(encode));
			}

			return EntityUtils.toString(entity1, Charset.forName("utf-8"));
		} 
		catch (ParseException e)
		{
			return null;
		} 
		catch (IOException e)
		{
			return null;
		}
		finally
		{
			try
			{
				response.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
  

	public String getRequestUrl()
	{
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl)
	{
		this.requestUrl = requestUrl;
	}

	public String getHost()
	{
		return host;
	}

	public void setHost(String host)
	{
		this.host = host;
	}

	public String getAccept()
	{
		return accept;
	}

	public void setAccept(String accept)
	{
		this.accept = accept;
	}

	public String getAcceptEncoding()
	{
		return acceptEncoding;
	}

	public void setAcceptEncoding(String acceptEncoding)
	{
		this.acceptEncoding = acceptEncoding;
	}

	public String getAcceptLanguage()
	{
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage)
	{
		this.acceptLanguage = acceptLanguage;
	}

	public String getConnectionkeep()
	{
		return connectionkeep;
	}

	public void setConnectionkeep(String connectionkeep)
	{
		this.connectionkeep = connectionkeep;
	}

	public String getEncode()
	{
		return encode;
	}

	public void setEncode(String encode)
	{
		this.encode = encode;
	}

	public String getContentType()
	{
		return contentType;
	}

	public void setContentType(String contentType)
	{
		this.contentType = contentType;
	}

	public String getCookie()
	{
		return cookie;
	}

	public void setCookie(String cookie)
	{
		this.cookie = cookie;
	}

	public String getUserAgent()
	{
		return userAgent;
	}

	public void setUserAgent(String userAgent)
	{
		this.userAgent = userAgent;
	}

	public String getOrigin()
	{
		return origin;
	}

	public void setOrigin(String origin)
	{
		this.origin = origin;
	}

	public String getReferer()
	{
		return referer;
	}

	public void setReferer(String referer)
	{
		this.referer = referer;
	}
	
	
}


