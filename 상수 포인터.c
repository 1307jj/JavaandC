//#include <stdio.h>
//
//int main() {
//	int a=10;
//	int b=20;
//	int const *pa = &a; //값은 고정, 주소는 바꿀수있다.
//	//*pa = 3; 올바르지 않은 문장
//	int *const pa = &a; //값을 바꿀수있고, 주소는 고정.
//
//	const int *const pa = &a; //값도 고정, 주소도 고정
//
//	printf("%d", *pa);
//}