package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder{
        
	
	private List<PrimeThread>listaThreads = new ArrayList<>();
        
	public  void findPrimes(BigInteger _a, BigInteger _b, PrimesResultSet prs,int N){
            
                BigInteger a=_a;
                BigInteger b=_b;
                Integer x= Integer.parseInt(a.toString());
                Integer y= Integer.parseInt(b.toString());

                MathUtilities mt=new MathUtilities();
                crearThreads(N,prs,a,b,x,y,mt);
                
                
                
                
                
	}
        
	public void crearThreads(int N, PrimesResultSet prs,BigInteger a, BigInteger b,Integer x,Integer y,MathUtilities mt){
            int primesSize = prs.size();
            for(Integer i=0;i<N;i++){
                if(y % N != 0){
                    PrimeThread threadCovid = new PrimeThread(i*((int)(y/N)+1),(i+1)*((int)(y/N)+1)-1,prs,mt);
                    listaThreads.add(threadCovid);
                }
                else{
                    PrimeThread threadCovid = new PrimeThread(i*(int)(y/N),(i+1)*(int)(y/N)-1,prs,mt);
                    listaThreads.add(threadCovid);
                }
            }
        
        }
	
	
	
	
}
