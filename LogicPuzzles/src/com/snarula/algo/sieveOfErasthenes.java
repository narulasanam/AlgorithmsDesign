package com.snarula.algo;

/*
 * complexity of n * loglogn
 */
public class sieveOfErasthenes {
	int max;

	public sieveOfErasthenes(int max) {
		this.max = max;
	}

	boolean[] getPrimeList() {
		boolean[] flags = new boolean[max + 1];
		int count = 0;

		init(flags);
		int prime = 2;

		while (prime < Math.sqrt(max)) {
			crossOff(flags, prime);

			prime = getNextPrime(flags, prime);
			
		}
		   int primes = 0;
	        for (int i = 2; i < flags.length; i++) {
	            if (flags[i]) {primes++;
	            System.out.println(i);}
	        }
	        System.out.println("The number of primes <= " + max + " is " + primes);
		return null;
	}

	private int getNextPrime(boolean[] flags, int prime) {
		int next = prime + 1;

		while (next < flags.length && !flags[next])
			next++;

		return next;
	}

	private void crossOff(boolean[] flags, int prime) {
		for(int i= prime*prime; i< flags.length; i+= prime) {
			flags[i] = false;
		}
	}

	void init(boolean[] flags) {
		for (int i = 2; i < flags.length; i++) {
			flags[i] = true;
		}
	}
	
	
	public static void main(String arg[]){
		sieveOfErasthenes ob = new sieveOfErasthenes(100);
		ob.getPrimeList();
	}
}
