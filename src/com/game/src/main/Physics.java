package com.game.src.main;

import com.game.src.main.classes.EntityA;
import com.game.src.main.classes.EntityB;

import java.util.LinkedList;

public class Physics {
    public static boolean Collision(EntityA enta, LinkedList<EntityB> entb){
        for(int i = 0; i < entb.size();i++){
            if(enta.getBounds().intersects(entb.get(i).getBounds())){
                return true;
            }
        }
        return false;
    }

    public static boolean Collision(EntityB entb, LinkedList<EntityA> enta){
        for(int i = 0; i < enta.size();i++){
            if(entb.getBounds().intersects(enta.get(i).getBounds())){
                return true;
            }
        }
        return false;
    }
}
