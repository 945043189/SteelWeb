package com.steelgt.gavin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baidu.ai.aip.utils.Base64Util;
import com.baidu.ai.aip.utils.FileUtil;
import com.baidu.ai.aip.utils.HttpUtil;
import com.steelgt.gavin.util.BaiduAuthService;

import java.net.URLEncoder;

/**
 * OCR 手写文字识别
 * 参考：https://ai.baidu.com/docs#/OCR-API/0d9adafa的通用文字识别（含位置信息版）java代码
 */
public class OCRByBaiduController {
	private static final Logger LOGGER = LoggerFactory.getLogger(OCRByBaiduController.class);

	/**
	 * 重要提示代码中所需工具类 FileUtil,Base64Util,HttpUtil,GsonUtils请从
	 * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
	 * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
	 * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
	 * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3 下载
	 */
	@RequestMapping("/orcByBaidu")
	String orc() {
		// 手写文字识别url
		String otherHost = "https://aip.baidubce.com/rest/2.0/ocr/v1/handwriting";
		String result = null;
		// 本地图片路径
		String filePath = "#####本地文件路径#####";
		try {
			byte[] imgData = FileUtil.readFileByBytes(filePath);
			String imgStr = Base64Util.encode(imgData);
			String params = URLEncoder.encode("image", "UTF-8") + "=" + URLEncoder.encode(imgStr, "UTF-8");
			/**
			 * 线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
			 */
			String accessToken = BaiduAuthService.getAuth();
			result = HttpUtil.post(otherHost, accessToken, params);
			LOGGER.info(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
