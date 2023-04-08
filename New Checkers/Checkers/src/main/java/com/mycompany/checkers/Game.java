/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.checkers;

/**
 *
 * @author wincr
 */
public class Game {
    private boolean validate;
    public Game(){
    this.validate = false;
    
    }
    public boolean validMove(int x, int y){
        if(y==8){
            y--;
        }
        if(x==8){
            x--;
        }
        if(x ==0 && y == 0 ){
           this.validate = true;
        }
        else if(x == 0 && y == 2 ){
        
           this.validate = true;
        }
        else if(x == 0 && y == 4){
            this.validate = true;
        }
        else if(x == 0 && y == 6){
            this.validate = true;
        }
        else if(x==1 && y==1){
            this.validate = true;            
        }
        else if(x==1 && y==3 ){
            this.validate = true;
        }
        else if(x==1 && y==5){
            this.validate = true;
        }
        else if(x==1 && y==7){
            this.validate = true;
        }
        else if(x == 2 && y == 0){
            this.validate = true;
        }
        else if(x==2 && y == 2){
            this.validate = true;
        }
        else if(x==2 && y==4){
            this.validate = true;
        }
        else if(x==2 && y==6){
            this.validate = true;
        }
        else if(x==3 && y==1){
            this.validate = true;            
        }
        else if(x==3 && y==3 ){
            this.validate = true;
        }
        else if(x==3 && y==5){
            this.validate = true;
        }
        else if(x==3 && y==7){
            this.validate = true;
        }
        else if(x == 4 && y == 0){
            this.validate = true;
        }
        else if(x==4 && y == 2){
            this.validate = true;
        }
        else if(x==4 && y==4){
            this.validate = true;
        }
        else if(x==4 && y==6){
            this.validate = true;
        }
        else if(x==5 && y==1){
            this.validate = true;            
        }
        else if(x==5 && y==3 ){
            this.validate = true;
        }
        else if(x==5 && y==5){
            this.validate = true;
        }
        else if(x==5 && y==7){
            this.validate = true;
        }
        else if(x == 6 && y == 0){
            this.validate = true;
        }
        else if(x==6 && y == 2){
            this.validate = true;
        }
        else if(x==6 && y==4){
            this.validate = true;
        }
        else if(x==6 && y==6){
            this.validate = true;
        }
        else if(x==7 && y==1){
            this.validate = true;            
        }
        else if(x==7 && y==3 ){
            this.validate = true;
        }
        else if(x==7 && y==5){
            this.validate = true;
        }
        else if(x==7 && y==7){
            this.validate = true;
        }
        else{
            this.validate = false;
        }
        
        return this.validate;
    }
    
}
