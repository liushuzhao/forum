package service.interfaces;

import entity.*;
import common.*;
import javax.servlet.ServletContext;
import java.util.*;
public interface TopicService
{
    public void addTopic(UserInfo userInfo,ServletContext servletContext) throws Exception;
    public List<Topic> getTopics(UserInfo userInfo);
    
}
