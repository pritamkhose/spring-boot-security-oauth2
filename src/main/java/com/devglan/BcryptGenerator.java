package com.devglan;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptGenerator {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			String password = "pritam";
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			String hashedPassword = passwordEncoder.encode(password);

			System.out.println(hashedPassword);
			i++;
		}

	  }
	
//	$2a$10$PpgyR1BxEIgupu9o.7VRouWn8CP6TLUuB.BxkvokpgEhcT8JcQFkC
//	$2a$10$.JNsFYJ9s1mNm9nm2ZVDA./ToCjrU3QdymNTD55C6GygXWTJs7yI2
//	$2a$10$TCFGF9AkQav8zL2E/dNuvudiidescVN.VaQmFulSdRB/.n7VSSoMK
//	$2a$10$ugslI22Z5N2ZEKZBBjcMMuuMZqDhL18Y89y7oSk3WCPwdsFywuxTW
//	$2a$10$NkkiOTfrxLLOgGmUpePgk.0PisOIedTkbFn4ePuj7XE7dlDL4vSCG

	

}
