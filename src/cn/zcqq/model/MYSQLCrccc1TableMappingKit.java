package cn.zcqq.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by jfinal-ext3, do not modify this file.
 * The jfinal-ext3's JFinalConfigExt will load this file silently.
 */
public class MYSQLCrccc1TableMappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		// Composite Primary Key order: id,name
		arp.addMapping("hello", "id,name", Hello.class);
		// Composite Primary Key order: id,name
		arp.addMapping("user", "id,name", User.class);
	}
}

