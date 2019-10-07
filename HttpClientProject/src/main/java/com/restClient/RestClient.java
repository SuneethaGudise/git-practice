package com.restClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.restBase.ResponseBase;
import com.restBase.TestBase;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
//import io.restassured.http.Header;
import org.apache.http.NameValuePair;


public class RestClient extends TestBase{
	
	CloseableHttpClient httpclient;
	
	public RestClient() {
		 httpclient = HttpClients.createDefault();	
	}
	
	
	
	
	//GET METHOD TO CALL SPECIFIED URL AND GET JSON RESPONSE
	public  int get(String url) throws ClientProtocolException, IOException {
		//abstract class     ref vari     class          method 
		// httpclient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);//to get the url
		CloseableHttpResponse httpresp = httpclient.execute(httpget);//hit the url
		
		//STATUS CODE
		int statuscode= httpresp.getStatusLine().getStatusCode();//get status code
		System.out.println("status code :" + statuscode);
		
		//TO GET ENTIRE STRING/CODE 
		String response = EntityUtils.toString(httpresp.getEntity());
		
		//TO CONVERT RESONSE FROM STRING TO JSON
		JSONObject job =new JSONObject(response);
		System.out.println("JSON response from API :" +job);
		
		//TO RETURN THE HEADER
	      Header[] headerArray =  httpresp.getAllHeaders();
		HashMap<String,String> allheader = new HashMap<String,String>();
		for(Header header : headerArray)
		{
			allheader.put(header.getName(), header.getValue());
		}
		System.out.println(allheader);
		return statuscode;
	}
		
		// POST METHOD
		public int postTest(String url) throws ClientProtocolException, IOException {
		//TO CREATE THE DATA
		 HttpPost httppost = new HttpPost(url);
		 List<NameValuePair> params = new ArrayList<NameValuePair>();
		 params.add(new BasicNameValuePair("name" ,"Nick"));
		 params.add(new BasicNameValuePair("job" ,"Manager"));
		 httppost.setEntity(new UrlEncodedFormEntity(params));
		 CloseableHttpResponse httpresp1 = httpclient.execute(httppost);
		 
		//STATUS CODE
		 int statuscode= httpresp1.getStatusLine().getStatusCode();//get status code
			System.out.println("status code :" + statuscode);
			//assertThat(httpresp1.getStatusLine().getStatusCode(), equalTo(200));
			return statuscode;
		}
        //GET METHOD RETURNS JSON OBJECT AND STATUSCODE
		public ResponseBase getTo(String url) throws ClientProtocolException, IOException {
			HttpGet get =new  HttpGet(url);
			CloseableHttpResponse resp = httpclient.execute(get);
			String response = EntityUtils.toString(resp.getEntity());
			JSONObject obj= new JSONObject(response);
			int code = resp.getStatusLine().getStatusCode();
			System.out.println("creating restresp");			
			ResponseBase restresp = new ResponseBase();
			System.out.println("step1: code=" + restresp.getStatuscode() + " json=" +  restresp.getJSONObject());						
			restresp.setStatuscode(code);
			restresp.setJSONObject(obj);
			System.out.println("step2: code=" + restresp.getStatuscode() + " json=" +  restresp.getJSONObject());						
			
			return restresp;
			
		}
		public int add(int x,int y) {
			int z=x+y;
			return z ;
		}
		
		public String concat(String str1,String str2)
		{
			String str3=str1+str2;
			return str3;
		}
		
 
		public HashMap<String,String>  getResponseHeader(String url) throws ClientProtocolException, IOException {
			HttpGet get =new HttpGet(url);
			CloseableHttpResponse resp = httpclient.execute(get);
			Header[] arrhead = resp.getAllHeaders();
			HashMap<String,String> allheader = new HashMap<String,String>();
			for(Header header : arrhead) {
				allheader.put(header.getName(), header.getValue());
			}
			return allheader;
			
		}





		
	}


