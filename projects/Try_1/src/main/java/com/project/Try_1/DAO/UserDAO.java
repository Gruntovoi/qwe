package com.project.Try_1.DAO;

import com.project.Try_1.Model.UserModel;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    ArrayList <UserModel> index = new ArrayList<>();
    UserModel userModel5= new UserModel();
    int UserCount;
    UserModel userModel = new UserModel(UserCount++,"Tomy","aosdoas");
    UserModel userModel2 = new UserModel(UserCount++,"Nikita","aosdoas");
    UserModel userModel3 = new UserModel(UserCount++,"Igor","aosdoas");
    {
        index.add(userModel);
        index.add(userModel2);
        index.add(userModel3);
    }

    public UserModel findid(int id){
        return index.get(id);
    }
    public UserModel findUser(String username){
        return index.stream().filter(userModel1 -> userModel1.getUsername().equals(username)).findAny().orElse(null);
    }
    public List<UserModel> index(){
        return index;
    }
    public void AddUser(String UserName, String password){
        UserModel userModel1= new UserModel(UserCount++,UserName,password);
        index.add(userModel1);
    }
}
