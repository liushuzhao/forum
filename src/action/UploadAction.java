package action;

import common.UploadFile;


public class UploadAction extends BaseAction 
{

    private UploadFile uploadFile = new UploadFile();
    
	public UploadFile getModel()
	{		
		return uploadFile;
	}

	public String execute() throws Exception
	{	
		try
		{
 			System.out.println("a");
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
}