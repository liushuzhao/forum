package common;

import com.fredck.FCKeditor.FCKeditor;
import com.fredck.FCKeditor.FCKeditorConfigurations;
import javax.servlet.http.*;

public class WebEditor
{
	public static void createFCKEditor(HttpServletRequest request, String width, String height)
	{
		String path = request.getContextPath();
		FCKeditor oFCKeditor;
		// ����һ��������ʹActionͨ��request�����FCKeditor�༭���е�ֵ
		oFCKeditor = new FCKeditor(request, "content");
		FCKeditorConfigurations con = new FCKeditorConfigurations();
		oFCKeditor.setConfig(con);
		oFCKeditor.setBasePath(path + "/FCKeditor/");
		oFCKeditor.setWidth(width);
		oFCKeditor.setHeight(height);
		
		oFCKeditor.setInstanceName("content");
		// ����FCKeditor�༭����ʱ��Ĭ��ֵ
		oFCKeditor.setValue("");
		request.setAttribute("editor", oFCKeditor.create());
	}
}
