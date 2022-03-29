package com.contrader.colloqui;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import io.jsonwebtoken.*;
import java.util.Date;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;

public class JWTDemo {

    // La chiave segreta è consigliabile metterla in un file a parte e non nel codice sorgente
    // è stato messo qui per semplicità
    private static String SECRET_KEY = "Bearer oeRaYY7Wo24sDqKSX3IM9ASGmdGPmkTd9jo1QTy4b7P9Ze5_9hKolVX8xNrQDcNRfVEdTZNOuOyqEGhXEbdJI-ZQ19k_o9MI0y3eZN2lp9jow55FfXMiINEdt1XR85VipRLSOkT6kSpzs2x-jbLDiz9iFVzkd81YKxMgPA7VfZeQUm4n-mOmnWMaVX30zGFU4L3oPBctYKkl4dYfqYWqRNfrgPJVi5DGFjywgxx0ASEiJHtV72paI3fDR2XwlSkyhhmY-ICjCRmsJN4fX1pdoL8a18-aQrvyu4j0Os6dVPYIoPvvY0SAZtWYKHfM15g7A3HD4cVREf9cUsprCRK93w";
    private static int ttlMillis = 600000; // 1 minuto -0
    private static String issuer = "JWT Builder"; // FORSE OPZIONALE!

    public static String createJWT(String id, String subject) {

        // L'algoritmo per criptare il token
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis); // inizio sessione es. 10:09

        // Settiamo le JWT Claims
        JwtBuilder builder = Jwts.builder().setId(id)
                .setIssuedAt(now)
                .setSubject(subject)
                .setIssuer(issuer) // FORSE OPZIONALE!
                .signWith(signatureAlgorithm,SECRET_KEY); // Criptiamo il JWT

        // Se il tempo per la scadenza impostato è inferiore a 0 la sessione non scadrà mai
        if (ttlMillis >= 0) {
            long expMillis = nowMillis + ttlMillis; // settiamo la scadenza es : 10:09 + 5 minuti | scadenza sessione = 10:14
            Date exp = new Date(expMillis);
            builder.setExpiration(exp);
        }

        // Compila il JWT e lo serializza in una stringa compatta e sicura per gli URL
        return builder.compact();
    }

    public static Claims decodeJWT(String jwt) {

        // Genera un eccezione se il JWT è scaduto
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(jwt).getBody(); // nel body mettiamo solo i dati non sensibi come user ID o username ecc.

        return claims;

    }

}