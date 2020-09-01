package com.company;

public class Ball {
    private boolean jump;

    public boolean isJump() {
        return jump;
    }

    public void setJump(boolean jump) {
        this.jump = jump;
    }

    public Ball(){
        jump = false;
    }

    @Override
    public String toString() {
        return "Ball";
    }
}
