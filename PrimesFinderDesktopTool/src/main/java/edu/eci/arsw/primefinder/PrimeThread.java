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
    public PrimeThread(BigInteger a, BigInteger b, PrimesResultSet prs,MathUtilities mt) {
        this.a=a;
        this.b=b;
        this.prs=prs;
        this.mt=mt;
    }
    public void run(){
        int itCount=0;
            
        BigInteger i=a;
        while (i.compareTo(b)<=0){
            itCount++;
            if (mt.isPrime(i)){
                prs.addPrime(i);
            }
            i=i.add(BigInteger.ONE);
        }
    }
    
}
