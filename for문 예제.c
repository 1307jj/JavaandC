#include <stdio.h>
//문제1 피라미드
//int main() {
//	int n,i,j,k;
//	printf("층수를 입력하세요 :");
//	scanf("%d", &n);
//
//	for (i=1; i <= n ;i++) {
//		for (j = 1; j <= n - i ; j++) {
//			printf(" ");
//		}
//		for (k=1; k <= 2*i-1 ;k++) {
//			printf("*");
//		}
//		printf("\n");
//	}
//}
//문제2 역피라미드
//int main() {
//	int n, i, j, k;
//	printf("층수를 입력하세요 :");
//	scanf("%d", &n);
//
//	for (i = 0; i < n ; i++) {
//		for (j=0; j<i ;j++) {
//			printf(" ");
//		}
//		for (k = 0; k < 2 * (n - i) - 1 ;k++) {
//			printf("*");
//		}
//		printf("\n");
//	}
//}
//문제3 1000 이하의 3 또는 5 의 배수인 자연수들의 합
//int main() {
//	int n, i, j, k, sum = 0;
//		for (i = 1; i <= 1000; i++) {
//			if (i % 3 ==0 || i % 5 ==0) {
//				sum += i;
//			}
//		}printf("3또는 5의 배수의 합 : %d", sum);
//
//	return 0;
//}
//int main() {
//	int a = ,b=;
//}