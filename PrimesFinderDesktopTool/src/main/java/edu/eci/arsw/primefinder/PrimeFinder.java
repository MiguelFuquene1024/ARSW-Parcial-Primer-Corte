package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder{
        
	
	
        
	public  static void findPrimes(BigInteger _a, BigInteger _b, PrimesResultSet prs,int N) throws InterruptedException{
            List<PrimeThread>listaThreads = new ArrayList<>();
            BigInteger a=_a;
            BigInteger b=_b;
            Integer x= Integer.parseInt(a.toString());
            Integer y= Integer.parseInt(b.toString());

            MathUtilities mt=new MathUtilities();
                
                
            int primesSize = prs.size();
            int itCount=0;
            for(Integer i=0;i<N;i++){
                x++;
                if(y % N != 0){
                    PrimeThread threadCovid = new PrimeThread(i*((int)(y/N)+1),(i+1)*((int)(y/N)+1)-1,prs,mt,itCount);
                    listaThreads.add(threadCovid);
                }
                else{
                    PrimeThread threadCovid = new PrimeThread(i*(int)(y/N),(i+1)*(int)(y/N)-1,prs,mt,itCount);
                    listaThreads.add(threadCovid);
                }
            }
            for(PrimeThread p:listaThreads){
                p.start();
            }
            for(PrimeThread p:listaThreads){
                p.join();
            }
            
        }
            
  
}
