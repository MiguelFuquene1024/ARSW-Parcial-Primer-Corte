package edu.eci.arsw.api.primesrepo;

import edu.eci.arsw.api.primesrepo.model.FoundPrime;
import edu.eci.arsw.api.primesrepo.service.PrimeService;
import edu.eci.arsw.api.primesrepo.service.PrimeServiceStub;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
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
    PrimeService primeService;

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
    public ResponseEntity addFoundPrime(@RequestBody FoundPrime foundPrime )
    {
        try{
            primeService.addFoundPrime(foundPrime);
            return new ResponseEntity<>("Registro con exito el prime" ,HttpStatus.ACCEPTED);
        }catch(Exception ex){
            return new ResponseEntity<>("Error al insertar el dato",HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping( value = "/primes/{primenumber}", method = GET )
    public ResponseEntity getPrime( @PathVariable String prime )    
    {
        try {
            return new ResponseEntity<>(primeService.getPrime(prime) ,HttpStatus.ACCEPTED);
        } catch (Exception ex) {
            return new ResponseEntity<>("Error al encontrar el primo",HttpStatus.NOT_FOUND);
        }
    }


    //TODO implement additional methods provided by PrimeService



}
