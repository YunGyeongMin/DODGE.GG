package com.lol.app.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lol.app.bean.SerchBean;

import net.sf.json.JSONObject;



@Controller
public class DataController {
	
	final static String API_KEY = "RGAPI-0b0afea8-aad1-4c4e-8bef-93a698841269";

	@RequestMapping(value="/search", method=RequestMethod.POST) 
	public String searchSummoner(Model model,HttpServletRequest req) throws Exception{
		String summonerUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" ;
		String summonerName = req.getParameter("summonerName");
		System.out.println(summonerName);
		URL url = new URL(summonerUrl + URLEncoder.encode(summonerName, "UTF-8") + "?api_key=" + API_KEY); 
		HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // url를 통해 HttpURLConnection 클래스를 생성한다.
		conn.setRequestMethod("GET"); // 해더의 메소드를 정의한다.
		int status = conn.getResponseCode();
		if(status == 200) { //200이면 정상
			Object obj = conn.getContent();
			//스트림으로 반환 결과값을 받는다.
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));   //결과물 읽어들인다.//BufferedReader에 넣는다
			String line;
			StringBuffer sf = new StringBuffer(); //문자열로 담을공간
			while((line = br.readLine()) != null){ // 한줄씩읽었을때 내용이 null일때까지
				sf.append(line);
			}
			System.out.println("가져온내용 : " + sf.toString()); //api를이용하여 가져온 데이터 확인!
			JSONObject jObj = JSONObject.fromObject(sf.toString()); // json객체로 만든다. JSONobject로는 받지 못한다.({}일경우 사용가능) JSONArray([]일경우 사용가능)
			//UserBean에 data등록
			String id = jObj.getString("id");
			String accountId = jObj.getString("accountId");
			String puuid = jObj.getString("puuid");
			String name = jObj.getString("name");
			int profileIconId = jObj.getInt("profileIconId");
			long revisionDate = jObj.getInt("revisionDate");
			long summonerLevel = jObj.getInt("summonerLevel");
			SerchBean sb = new SerchBean(id, accountId, puuid, name, profileIconId, revisionDate, summonerLevel);
			System.out.println("SerchBean : " + sb);
		}
		
		
		
		
		return "home";
	}
}
