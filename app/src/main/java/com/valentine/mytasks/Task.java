package com.valentine.mytasks;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by valentine on 8/19/15.
 */
@ParseClassName("Tasks")
public class Task extends ParseObject{
    public Task(){
    }
    public boolean isCompleted(){
        return getBoolean("completed");
    }


}
