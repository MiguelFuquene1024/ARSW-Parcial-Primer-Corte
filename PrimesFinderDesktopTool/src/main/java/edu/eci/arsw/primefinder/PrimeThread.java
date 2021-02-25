/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;

/**
 *
 * @author Acer
 */
public class PrimeThread extends Thread {
    private BigInteger a;
    private BigInteger b;
    private PrimesResultSet prs;
    private MathUtilities mt;
    private int itCount;
    public PrimeThread(Integer a, Integer b, PrimesResultSet prs,MathUtilities mt,int itCount) {
        this.a=new BigInteger(a.toString());
        this.b=new BigInteger(b.toString());
        this.prs=prs;
        this.mt=mt;
        this.itCount = itCount;
    }
    public void run(){
        
            
        BigInteger i=a;
        while (i.compareTo(b)<=0){
            itCount++;
            if (mt.isPrime(i)){
                prs.addPrime(i);
                itCount++;
            }
            i=i.add(BigInteger.ONE);
        }
    }
    
}
