package edu.eci.arsw.api.primesrepo.service;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@Controller
public class PrimeServiceStub implements PrimeService
{
    List<FoundPrime> primes= new ArrayList<>();

    public PrimeServiceStub() {
        
    }
    
    @Override
    public void addFoundPrime( FoundPrime foundPrime )
    {
        
        primes.add(foundPrime);
    }

    @Override
    public List<FoundPrime> getFoundPrimes()
    {
        return primes;
    }

    @Override
    public FoundPrime getPrime( String primee )
    {
        for(FoundPrime f:primes){
            if(f.getPrime().equals(primee)){
                return f;
            }
        }
        return null;
    }
}
