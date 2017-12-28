package dao.interfaces;

import entity.*;
import java.util.*;

public interface TopicDAO
{
    public void save(Topic topic);  
    public List query(String hql, Object... params);
    public void execute(final String hql, final Object... params);
}
