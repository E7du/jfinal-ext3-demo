package cn.zcqq.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     Crccc1TableMappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class Crccc1TableMappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("user", "id", User.class);
	}
}
