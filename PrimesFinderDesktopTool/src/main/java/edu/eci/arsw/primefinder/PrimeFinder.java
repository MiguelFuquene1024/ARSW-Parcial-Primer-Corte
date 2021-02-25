package edu.eci.arsw.primefinder;

import edu.eci.arsw.math.MathUtilities;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class PrimeFinder{
        
	
	
        
	public static void findPrimes(BigInteger _a, BigInteger _b, PrimesResultSet prs,int N){
            
                BigInteger a=_a;
                BigInteger b=_b;

                MathUtilities mt=new MathUtilities();
                crearThreads(N,prs);
                
                
                
                
                
	}
        
	private void crearThreads(int N, PrimesResultSet prs){
            amountOfFilesTotal = resultFiles.size();
            for(int i=0;i<N;i++){
                if(amountOfFilesTotal % N != 0){
                    ProcessingThread threadCovid = new ProcessingThread(i*((int)(amountOfFilesTotal/N)+1),(i+1)*((int)(amountOfFilesTotal/N)+1)-1,resultFiles,testReader,resultAnalyzer,amountOfFilesProcessed);
                    listaThreads.add(threadCovid);
                }
                else{
                    ProcessingThread threadCovid = new ProcessingThread(i*(int)(amountOfFilesTotal/N),(i+1)*(int)(amountOfFilesTotal/N)-1,resultFiles,testReader,resultAnalyzer,amountOfFilesProcessed);
                    listaThreads.add(threadCovid);
                }
            }
        
        }
	
	
	
	
}
