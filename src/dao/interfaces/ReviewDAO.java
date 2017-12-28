package dao.interfaces;

import entity.*;
import java.util.*;

public interface ReviewDAO
{
    public void save(Review review);  
    public List query(String hql, Object... params);
}
