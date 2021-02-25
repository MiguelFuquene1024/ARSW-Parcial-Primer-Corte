package edu.eci.arsw.api.primesrepo;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import edu.eci.arsw.api.primesrepo.service.PrimeService;
import edu.eci.arsw.api.primesrepo.service.PrimeServiceStub;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.http.ResponseEntity;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
@RestController
public class PrimesController
{
    @Autowired
    PrimeServiceStub primeService;

    @RequestMapping( value = "/primes", method = GET )
    public ResponseEntity getPrimes()
    {
        try {
            return new ResponseEntity<>(primeService.getFoundPrimes() ,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al encontrar los primos",HttpStatus.NOT_FOUND);
        } 
        
    }
    @RequestMapping( value = "/primes", method = POST )
    public ResponseEntity addFoundPrime( FoundPrime foundPrime )
    {
        try{
            
        }
        primeService.addFoundPrime(foundPrime);
        return null;
    }
    @RequestMapping( value = "/primes", method = GET )
    public FoundPrime getPrime( String prime )    
    {
        
        return primeService.getPrime(prime);
    }


    //TODO implement additional methods provided by PrimeService



}
