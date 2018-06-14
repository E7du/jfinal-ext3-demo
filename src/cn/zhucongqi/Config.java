/**
 * 
 */
package cn.zhucongqi;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.config.JFinalConfigExt;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.template.Engine;

/**
 * @author BruceZCQ
 * Jun 22, 20154:38:47 PM
 */
public class Config extends JFinalConfigExt {

	@Override
	public void configMoreConstants(Constants me) {
	}

	@Override
	public void configMoreRoutes(Routes me) {
	}

	@Override
	public void configMorePlugins(Plugins me) {
		
	}

	@Override
	public void configTablesMapping(String configname, ActiveRecordPlugin arp) {
		
	}

	@Override
	public void configMoreInterceptors(Interceptors me) {
		
	}

	@Override
	public void configMoreHandlers(Handlers me) {
		
	}

	@Override
	public void afterJFinalStarted() {
		
	}

	@Override
	public void configEngine(Engine me) {
		
	}

}
