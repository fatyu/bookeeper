package cc.notalk.v.web.controller.site;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.notalk.v.entity.JsonResponseMsg;
import cc.notalk.v.service.site.FileService;
import cc.notalk.v.service.site.UrlService;
import cc.notalk.v.web.controller.BaseController;

@Controller
@RequestMapping("/")
public class SiteController extends BaseController {

	@Autowired
	FileService fileService;

	@Autowired
	UrlService urlService;

	@RequestMapping(value = "site/file2db")
	@ResponseBody
	public JsonResponseMsg file2db() {
		fileService.fetchSite();
		return new JsonResponseMsg().fill(0, "success");
	}

	@RequestMapping(value = "site/url")
	@ResponseBody
	public JsonResponseMsg page2db(String url) {

		String[] urls = StringUtils.split(url, "|");
		for (String uri : urls) {
			urlService.fetchSite(uri);
		}

		return new JsonResponseMsg().fill(0, "success");

	}

}