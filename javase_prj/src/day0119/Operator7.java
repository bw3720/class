package day0119;
/**
대입연산자<br>
=,
+=, -=, *=, /=
<<=, >>=, >>>=
&=, |=, ^=
*/

class Operator7{
	public static void main(String[] args) {
		
		int i =3; //순수대입
		//산술 대입
		i += 2; // i = i+2;
		i -= 1; // i = i-1;
		i *= 3; // i = i*3;
		
		i /= 5; // i = i/5; ------> 정수/정수=정수, 실수/실수=실수, 정수/실수=실수  (int는 정수 그릇이기 때문에) 
		
		
		//쉬프트대입
		i <<= 4; // i = i<<4; // 0000 0010 << 4 = 0010 0000
		i >>= 1; // i = i>>1; // 0010 0000 >> 1 = 0001 0000
		i >>>= 2; // i = i>>>2; // 0001 0000 >>>2 = 0000 0100
		
		//비트대입
		i &= 12; // i = i&12; // 0000 0100 & 0000 1100 = 0000 0100
		i |= 6; // i = i|6; // 0000 0100 | 0000 0110 = 0000 0110
		i ^= 9; // i = i^9; // 0000 0110 ^ 0000 1001 = 0000 1111
		System.out.println(i);

		i = 1;
		i++; // i = i+1; , i += 1;
	}//main
}//class
