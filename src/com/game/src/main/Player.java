package com.game.src.main;

import com.game.src.main.classes.EntityA;
import com.game.src.main.libs.Animation;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player  extends GameObject implements EntityA {

    private double velX = 0;
    private double velY = 0;
    private Textures tex;

    Animation anim;

    public Player(double x,double y,Textures tex){
        super(x,y);
        this.tex = tex;
        anim = new Animation(5, tex.player[0],tex.player[1],tex.player[2]);
        //SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());
        //player = ss.grabImage(1,1,32,32);
    }

    public Rectangle getBounds(){
        return new Rectangle((int) x,(int) y,32,32);
    }

    public void tick(){
        x+=velX;
        y+=velY;

        if(x <= 0){
            x = 0;
        }else if (x >= 640){
            x = 640;
        }else if(y <= 0){
            y = 0;
        }else if(y >= 480 - 32){
            y = 480 - 32;
        }

        anim.runAnimation();
    }

    public void render(Graphics g){
        anim.drawAnimation(g,x,y,0);
        //g.drawImage(tex.player[0],(int) x,(int) y,null);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }
}
