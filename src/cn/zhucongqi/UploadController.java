/**
 * 
 */
package cn.zhucongqi;

import java.util.ArrayList;
import java.util.List;

import com.jfinal.ext.core.ControllerExt;
import com.jfinal.ext.kit.JsonExtKit;
import com.jfinal.upload.UploadFile;

/**
 * @author BruceZCQ
 * Jun 22, 20154:55:18 PM
 */
public class UploadController extends ControllerExt {

	public void index(){

		List<UploadFile> files = this.getFilesSaveToDatePath();
		
		StringBuilder sb = new StringBuilder();
		for (UploadFile file : files) {
			
			String info = "origin==>"+file.getOriginalFileName()+
					"\n path =>"+file.getFile().getAbsolutePath()
					+"\n savepath" + file.getUploadPath()
					+ "\n db info >>"+file.getFileName();
			sb.append("\n\n\n").append(info);
		}
		this.renderText(sb.toString());
		
		
		
//		UploadFile img123 = this.getFile("img123", policy);
//		String name = this.getPara("name");
//		UploadFile img = this.getFile("img1", policy);
//		
//		this.renderText("image"+img123.getFileName()+"ing=>"+img.getFileName()+policy.getAppParentDateDir());
		
//		UploadFile file = this.getFile("img", policy);
		
		//		UploadFile file = this.getFile("img", new CustomParentDirFileRenamePolicy("BruceZCQ",NamePolicy.ORIGINAL_NAME));
//		this.renderText("origin==>"+file.getOriginalFileName()+"path=>"+file.getFile().getAbsolutePath());
	}
	
	public void name () {
		String names = this.getPara("names");
		Object[] objs = JsonExtKit.jsonToObjArray(names);
		List<String> aa = new ArrayList<String>();
		aa.add("ss");
		aa.add("ee");
		this.renderJson(aa);
	}
	
	public void nn() {
//		String data = HttpKit.readIncommingRequestData(this.getRequest());
		byte[] data = HttpExtKit.readIncommingRequestHexByteData(this.getRequest());
		this.renderJson((new String(data))+this.getPara("atid"));
	}

	
	public void a() {
//		try {
//			this.getRequest().getRequestDispatcher("/upload/upload/b").forward(getRequest(), getResponse());
//			return;
//		} catch (ServletException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		this.renderNull();
		this.forwardAction("/upload/b");
		
	}
	
	public void b() {
		this.renderText(this.getPara("name"));
	}
	
	public void zzz() {
		this.renderText("zzz");
	}
	
	@Override
	public void onExceptionError(Exception e) {
		// TODO Auto-generated method stub
		
	}
	
//	public void dateFileRenampolicy(){
//		DateRandomFileRenamePolicy policy = new DateRandomFileRenamePolicy("group"); 
//		UploadFile file = this.getFile("img", policy);
//		//this.renderText("origin==>"+file.getOriginalFileName()+"\npath=>"+file.getFile().getAbsolutePath()+"\nFileSavePath=>"+policy.getFileSavePath());
//	}
}
