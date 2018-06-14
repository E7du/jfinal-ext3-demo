/**
 * 
 */
package cn.zhucongqi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author congqizhu
 *
 */
public class Upload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> para = new HashMap<>();
		para.put("nn", "朱丛启");
		para.put("atid",  "[\"{\\\"uid\\\":\\\"1\\\",\\\"utype\\\":1}\",\"{\\\"uid\\\":\\\"2\\\",\\\"utype\\\":2}\"]");
		String ret = HttpExtKit.postHexString("http://localhost:8082/upload/upload/nn", para, new String("data朱asdfasdfadsfadsfadsf丛启").getBytes(), null);
	System.out.println(ret);
	}

}
