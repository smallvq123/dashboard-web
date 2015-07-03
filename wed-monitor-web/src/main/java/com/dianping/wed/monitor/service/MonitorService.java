package com.dianping.wed.monitor.service;

import com.dianping.wed.monitor.config.service.dto.MonitorChartOptionDTO;
import com.dianping.wed.monitor.config.service.dto.MonitorPageConfigDTO;
import com.dianping.wed.monitor.config.service.dto.MonitorQueryTemplateDTO;
import com.dianping.wed.monitor.data.service.dto.MonitorDataDTO;
import com.dianping.wed.monitor.data.service.dto.MonitorQueryDTO;

import java.util.Map;

/**
 * @author dan.shan
 * @since 2015-06-03 10:07
 */
public interface MonitorService {

    MonitorDataDTO findDataByPageId(int pageId, Map<String, String> params);

    MonitorPageConfigDTO loadPageConfigByPageId(int pageId);

    MonitorChartOptionDTO loadChartOptionByPageId(int pageId);

    MonitorQueryTemplateDTO loadQueryTemplateByPageId(int pageId);

    MonitorQueryDTO renderMonitorQuery(MonitorQueryTemplateDTO template, Map<String, String> params);
}