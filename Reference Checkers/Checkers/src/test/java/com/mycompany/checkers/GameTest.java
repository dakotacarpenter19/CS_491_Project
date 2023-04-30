/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.checkers;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author wincr
 */

public class GameTest {

    public GameTest() {
     
    
    }


    /**
     * Test of setSelectedPiece method, of class Game.
     */
    @Test
    public void testSetSelectedPiece() {
        System.out.println("setSelectedPiece");
        int row = 0;
        int col = 0;
        Game instance = new Game();
        instance.setSelectedPiece(row, col);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of movePiece method, of class Game.
     */
    @Test
    public void testMovePiece() {
        System.out.println("movePiece");
        int row = 0;
        int col = 0;
        boolean isRed = false;
        Game instance = new Game();
        instance.movePiece(row, col, isRed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of isValidMove method, of class Game.
     */
    @Test
    public void testIsValidMove() {
        System.out.println("isValidMove");
        int startRow = 0;
        int startCol = 0;
        int endRow = 0;
        int endCol = 0;
        boolean isRed = false;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        startRow = 0;
        startCol = 0;
        endRow = -3;
        endCol = -3;
        isRed = true;
        expResult = false;
        result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);
        
        startRow = 0;
        startCol = 2;
        endRow = 4;
        endCol = 3;
        isRed = true;
        expResult = false;
        result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);
        
        startRow = 0;
        startCol = 0;
        endRow = -3;
        endCol = -3;
        isRed = true;
        expResult = false;
        result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);
        
        startRow = 4;
        startCol = 2;
        endRow = 3;
        endCol = 3;
        isRed = true;
        expResult = true;
        result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);
        
        startRow = 7;
        startCol = 2;
        endRow = 3;
        endCol = 3;
        isRed = false;
        expResult = false;
        result = instance.isValidMove(startRow, startCol, endRow, endCol, isRed);
        assertEquals(expResult, result);        
    }

 
 
    
}
