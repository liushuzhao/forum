package service.interfaces;

import entity.User;
public interface UserService
{
    public void addUser(User user) throws Exception;
    public User LoadUser(String username);
	public boolean verifyUser(User user);
}
