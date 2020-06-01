package com.kandy.junit_week8;

public class Number {
	public int power(int x, long y) 
    { 
        if( y == 0) 
            return 1; 
        if (y%2 == 0) 
            return power(x, y/2)*power(x, y/2); 
        return x*power(x, y/2)*power(x, y/2); 
    }
	
	public int checkPrime(int x) {
		if(x<2) {
			throw new IllegalArgumentException("input value must be greater than 1");
		}
		else if( x>2 && x%2 ==0 )
			return 0;
		else if (x==2)
			return 1;
		else {
			for(int i=3; i*i<=x; i++) {
				if(x%i == 0)
					return 0;
			}
		}
		return 1;
	}
	
	public boolean checkArmstrong(int x) {
		int order=0;
		int temp = x;
		while(temp!=0) {
			order++;
			temp /= 10;
		}
		
		temp = x;
		int sum = 0;
		while(temp!=0) {
			int r = temp%10;
			sum += power(r, order);
			temp /= 10; 
		}
		
		return (sum==x);
	}
	
	public boolean checkPalindrome(int x) {
		int temp = x;
		int sum = 0;
		
		while(x!=0) {
			sum *= 10;
			sum += (x%10);
			x /= 10;
		}
		
		return (sum == temp);
	}
}
