package entity;

public class User
{
    private int id;
	private String name;
    private String password;
    private String repassword;
    private String passwordMD5;
    private String xm;
    private String email;
    private String phone;
    private String qq;
    private String validationCode;
	
    /**
	 * validationCode属性的getter方法
	 */
	public String getValidationCode()
	{
		return validationCode;
	}
	/**
	 * validationCode属性的setter方法
	 */
	public void setValidationCode(String validationCode)
	{
		this.validationCode = validationCode;
	}

	/**
	 * name属性的getter方法
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * name属性的setter方法 
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * password属性的getter方法
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * password属性的setter方法
	 */
	public void setPassword(String password) throws Exception
	{
		this.password = password;
		this.passwordMD5 = common.Encrypter.md5Encrypt(password);
	}
	/**
	 * xm属性的getter方法
	 */
	public String getXm()
	{
		return xm;
	}
	/**
	 * xm属性的setter方法
	 */
	public void setXm(String xm)
	{
		this.xm = xm;
	}
	/**
	 * email属性的getter方法
	 */
	public String getEmail()
	{
		return email;
	}
	/**
	 * email属性的setter方法
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	/**
	 * phone属性的getter方法
	 */
	public String getPhone()
	{
		return phone;
	}
	/**
	 * phone属性的setter方法
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	/**
	 * qq属性的getter方法
	 */
	public String getQq()
	{
		return qq;
	}
	/**
	 * qq属性的setter方法
	 */
	public void setQq(String qq)
	{
		this.qq = qq;
	}
	/**
	 * passwordMD5属性的getter方法
	 */
	public String getPasswordMD5() throws Exception
	{
		return passwordMD5;
		
	}

	
    public String toString()
    {
    	return getName();
    }
	/**
	 * repassword属性的getter方法
	 */
	public String getRepassword()
	{
		return repassword;
	}
	/**
	 * repassword属性的setter方法
	 */
	public void setRepassword(String repassword)
	{
		this.repassword = repassword;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * passwordMD5属性的setter方法
	 */
	public void setPasswordMD5(String passwordMD5)
	{
		this.passwordMD5 = passwordMD5;
	}
}
