package edu.eci.arsw.api.primesrepo.model;

import java.io.Serializable;

/**
 * @author Santiago Carrillo
 * 2/22/18.
 */
public class FoundPrime implements Serializable
{

    
    
    private String user;

    private String prime;
    
    public FoundPrime(String user, String prime) {
        this.user = user;
        this.prime = prime;
    }

    public FoundPrime()
    {
    }

    public String getUser()
    {
        return user;
    }

    public void setUser( String user )
    {
        this.user = user;
    }

    public String getPrime()
    {
        return prime;
    }

    public void setPrime( String prime )
    {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "{" + "user:" + user + ", prime:" + prime + '}';
    }
}
