package com.herokuapp.kon104.webapp.domain;

import com.herokuapp.kon104.webapp.domain.GrgmapAppForm;
import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Service;


@Service
public class GrgmapAppFormService
{
	private Map<Integer, GrgmapAppForm> appforms = new HashMap<Integer, GrgmapAppForm>(){
		{
			put(1, new GrgmapAppForm(1, "北海道"));
			put(2, new GrgmapAppForm(2, "青森県"));
			put(3, new GrgmapAppForm(3, "岩手県"));
			put(4, new GrgmapAppForm(4, "宮城県"));
			put(5, new GrgmapAppForm(5, "秋田県"));
			put(6, new GrgmapAppForm(6, "山形県"));
			put(7, new GrgmapAppForm(7, "福島県"));
			put(8, new GrgmapAppForm(8, "茨城県"));
			put(9, new GrgmapAppForm(9, "栃木県"));
			put(10, new GrgmapAppForm(10, "群馬県"));
			put(11, new GrgmapAppForm(11, "埼玉県"));
			put(12, new GrgmapAppForm(12, "千葉県"));
			put(13, new GrgmapAppForm(13, "東京都"));
			put(14, new GrgmapAppForm(14, "神奈川県"));
		}
	};

	public GrgmapAppFormService()
	{
		// 北海道
		this.appforms.get(1).distUrl = "http://www.police.pref.hokkaido.lg.jp/guide/jidousya/jidousya.html";
		this.appforms.get(1).pdfUrl = "http://www.police.pref.hokkaido.lg.jp/shinsei/data_pdf/kotu/shako/hokan-1.pdf";
		this.appforms.get(1).page = 7;
		this.appforms.get(1).maxSide = 340;
		this.appforms.get(1).imgposY = 120;
		this.appforms.get(1).imgposXov = 85;
		this.appforms.get(1).imgposXzm = 448;

		// 青森県
		this.appforms.get(2).distUrl = "https://www.police.pref.aomori.jp/koutubu/kisei/b7_syako_syomei.html";
		this.appforms.get(2).pdfUrl = "https://www.police.pref.aomori.jp/koutubu/kisei/pdf/pdf/6-6.PDF";
		this.appforms.get(2).page = 1;
		this.appforms.get(2).maxSide = 310;
		this.appforms.get(2).imgposY = 144;
		this.appforms.get(2).imgposXov = 86;
		this.appforms.get(2).imgposXzm = 431;

		// 岩手県
		this.appforms.get(3).distUrl = "http://www2.pref.iwate.jp/~hp0802/oshirase/kou-kisei/hokanbasyo/index.html";

		// 宮城県
		this.appforms.get(4).distUrl = "http://www.police.pref.miyagi.jp/hp/kisei/syako/car.htm";
		this.appforms.get(4).pdfUrl = "http://www.police.pref.miyagi.jp/hp/kisei/syako/syozaizu.pdf";
		this.appforms.get(4).page = 1;
		this.appforms.get(4).maxSide = 280;
		this.appforms.get(4).imgposY = 190;
		this.appforms.get(4).imgposXov = 100;
		this.appforms.get(4).imgposXzm = 460;

		// 秋田県
		this.appforms.get(5).distUrl = "http://www.police.pref.akita.jp/kenkei/tetuzuki/09.html";

		// 山形県
		this.appforms.get(6).distUrl = "https://www.pref.yamagata.jp/police/procedures/6800032hokanbasho.html";
		this.appforms.get(6).pdfUrl = "https://www.pref.yamagata.jp/ou/keisatsu/800032/publicfolder20090310/syozaizu.pdf";
		this.appforms.get(6).page = 1;
		this.appforms.get(6).quadrant = 1;
		this.appforms.get(6).transform = true;
		this.appforms.get(6).maxSide = 310;
		this.appforms.get(6).imgposY = 145;
		this.appforms.get(6).imgposXov = 100;
		this.appforms.get(6).imgposXzm = 440;

		// 福島県
		this.appforms.get(7).distUrl = "http://www.police.pref.fukushima.jp/03.tetuduki/-kotu/H29.4.1hokan/29.4.1hokan.html";
		this.appforms.get(7).pdfUrl = "http://www.police.pref.fukushima.jp/03.tetuduki/-kotu/H29.4.1hokan/290401haitizu.pdf";
		this.appforms.get(7).page = 1;
		this.appforms.get(7).maxSide = 260;
		this.appforms.get(7).imgposY = 195;
		this.appforms.get(7).imgposXov = 125;
		this.appforms.get(7).imgposXzm = 460;

		// 茨城県
		this.appforms.get(8).distUrl = "https://www.pref.ibaraki.jp/kenkei/a06_shinsei/street_traffic/depository/depository01.html";
		this.appforms.get(8).pdfUrl = "https://www.pref.ibaraki.jp/kenkei/a06_shinsei/street_traffic/depository/pdf/hokan_syozaizu2.pdf";
		this.appforms.get(8).page = 1;
		this.appforms.get(8).transform = true;
		this.appforms.get(8).maxSide = 310;
		this.appforms.get(8).imgposY = 115;
		this.appforms.get(8).imgposXov = 105;
		this.appforms.get(8).imgposXzm = 460;

		// 栃木県
		this.appforms.get(9).distUrl = "http://www.pref.tochigi.lg.jp/keisatu/tetuzuki/";

		// 群馬県
		this.appforms.get(10).distUrl = "https://www.police.pref.gunma.jp/koutuubu/03kisei/hokanbasyo/sinsei.html";
		this.appforms.get(10).pdfUrl = "https://www.police.pref.gunma.jp/koutuubu/03kisei/hokanbasyo/data/01p.pdf";
		this.appforms.get(10).page = 1;
		this.appforms.get(10).transform = true;
		this.appforms.get(10).maxSide = 310;
		this.appforms.get(10).imgposY = 165;
		this.appforms.get(10).imgposXov = 72;
		this.appforms.get(10).imgposXzm = 410;

		// 埼玉県
		this.appforms.get(11).distUrl = "https://www.police.pref.saitama.lg.jp/f0040/shinse/hokan.html";

		// 千葉県
		this.appforms.get(12).distUrl = "http://www.police.pref.chiba.jp/kotsukiseika/window_permiti-11.html";

		// 東京都
		this.appforms.get(13).distUrl = "http://www.keishicho.metro.tokyo.jp/tetsuzuki/kotsu/hokan/syako_tetsuzuki/jidousha_syomei.html";
		this.appforms.get(13).pdfUrl = "classpath:data/pdf/tokyo.pdf";
		this.appforms.get(13).page = 1;
		this.appforms.get(13).transform = true;
		this.appforms.get(13).maxSide = 325;
		this.appforms.get(13).imgposY = 150;
		this.appforms.get(13).imgposXov = 80;
		this.appforms.get(13).imgposXzm = 428;

		// 神奈川県
		this.appforms.get(14).distUrl = "https://www.police.pref.kanagawa.jp/mes/mesf4020.htm";
		this.appforms.get(14).pdfUrl = "https://www.police.pref.kanagawa.jp/pdf/f4020_02.pdf";
		this.appforms.get(14).page = 3;
		this.appforms.get(14).maxSide = 340;
		this.appforms.get(14).imgposY = 170;
		this.appforms.get(14).imgposXov = 70;
		this.appforms.get(14).imgposXzm = 428;


	}

	public Map<Integer, GrgmapAppForm> findAll()
	{
		return this.appforms;
	}
}
