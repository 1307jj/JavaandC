//#include <stdio.h>
//
//int main() {
//	int a, b;
//	double c;
//	a = 10;
//	b = 3;
//	c = 3;
//
//	printf("A + B = : %d \n", a + b);
//	printf("a - b = %d \n", a - b);
//	printf("a * b = %d \n", a * b);
//	printf("a / b = %d \n", a / b);
//	printf("a %% b = %d \n", a % b); //나머지 연산자는 %%두개 %하나면 %d,%x,%f 이런식쓰여서 에러
//
//	printf("a / c = %f \n", a / c); //산술변환 - a는 int(정수형) < b는 double(실수형)  
//	printf("c / a = %f \n", c / a); // -> 정수형변수가 실수형변수로 무조건 상승
//	return 0;
//}