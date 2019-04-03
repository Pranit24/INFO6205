/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.coe.info6205.balsearchtree;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mrunal
 */
public class LeftLearingRedBlackBSTTest {
    
        String key1 = "z";
        String key2 = "b";
        String key3 = "h";
        String key4 = "a";
        String key5 = "r";
    
    public LeftLearingRedBlackBSTTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of size method, of class LeftLearingRedBlackBST.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        
        instance.put(key1,5);
        instance.put(key2, 4);
        expResult = 2;
        result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class LeftLearingRedBlackBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key ="z";
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        instance.put(key1,5);
        instance.put(key3,2);
        Object expResult = 5;
        Object result = instance.get((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of rotateLeft method, of class LeftLearingRedBlackBST.
     */
//    @Test
//    public void testRotateLeft() {
//        System.out.println("rotateLeft");
//        LeftLearingRedBlackBST.Node h = null;
//        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
//        LeftLearingRedBlackBST.Node expResult = null;
//        LeftLearingRedBlackBST.Node result = instance.rotateLeft(h);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of rotateRight method, of class LeftLearingRedBlackBST.
//     */
//    @Test
//    public void testRotateRight() {
//        System.out.println("rotateRight");
//        LeftLearingRedBlackBST.Node h = null;
//        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
//        LeftLearingRedBlackBST.Node expResult = null;
//        LeftLearingRedBlackBST.Node result = instance.rotateRight(h);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of flipColors method, of class LeftLearingRedBlackBST.
//     */
//    @Test
//    public void testFlipColors() {
//        System.out.println("flipColors");
//        LeftLearingRedBlackBST.Node h = null;
//        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
//        instance.flipColors(h);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of rank method, of class LeftLearingRedBlackBST.
//     */
    @Test
    public void testRank() {
        System.out.println("rank");
        Object keyH = "h";
        Object keyZ = "z";
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        int expResultH = 2;
        int expResultZ = 3;
        instance.put(key1,4);
        instance.put(key2,9);
        instance.put(key3,3);
        instance.put(key4,7);
        int resultH = instance.rank((Comparable) keyH);
        int resultZ = instance.rank((Comparable) keyZ);
        assertEquals(expResultH, resultH);
        assertEquals(expResultZ, resultZ);
        
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of put method, of class LeftLearingRedBlackBST.
//     */
//    @Test
//    public void testPut() {
//        System.out.println("put");
//        Object key = null;
//        Object val = null;
//        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
//        instance.put(key, val);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of min method, of class LeftLearingRedBlackBST.
//     */
    @Test
    public void testMin() {
        System.out.println("min");
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        instance.put(key1,4);
        instance.put(key2,9);
        instance.put(key3,3);
        instance.put(key4,7);
        Object expResult = "a";
        Object result = instance.min();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of max method, of class LeftLearingRedBlackBST.
//     */
    @Test
    public void testMax() {
        System.out.println("max");
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        instance.put(key1,4);
        instance.put(key2,9);
        instance.put(key3,3);
        instance.put(key4,7);
        Object expResult = "z";
        Object result = instance.max();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
//
//    /**
//     * Test of floor method, of class LeftLearingRedBlackBST.
//     */
    @Test
    public void testFloor() {
        System.out.println("floor");
        Object key = key5;
        LeftLearingRedBlackBST instance = new LeftLearingRedBlackBST();
        instance.put(key1,4);
        instance.put(key2,9);
        instance.put(key3,3);
        instance.put(key4,7);
        Object expResult = "h";
        Object result = instance.floor((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
