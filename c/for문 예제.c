#include <stdio.h>

//문제1 피라미드
//int main() {
//   int n,i,j,k;
//   printf("층수를 입력하세요 :");
//   scanf("%d", &n);
//
//   for (i=1; i <= n ;i++) {
//      for (j = 1; j <= n - i ; j++) {
//         printf(" ");
//      }
//      for (k=1; k <= 2*i-1 ;k++) {
//         printf("*");
//      }
//      printf("\n");
//   }
//}

//문제2 역피라미드
//int main() {
//   int n, i, j, k;
//   printf("층수를 입력하세요 :");
//   scanf("%d", &n);
//
//   for (i = 0; i < n ; i++) {
//      for (j=0; j<i ;j++) {
//         printf(" ");
//      }
//      for (k = 0; k < 2 * (n - i) - 1 ;k++) {
//         printf("*");
//      }
//      printf("\n");
//   }
//}

//문제3 1000 이하의 3 또는 5 의 배수인 자연수들의 합
//int main() {
//   int n, i, j, k, sum = 0;
//      for (i = 1; i <= 1000; i++) {
//         if (i % 3 ==0 || i % 5 ==0) {
//            sum += i;
//         }
//      }printf("3또는 5의 배수의 합 : %d", sum);
//
//   return 0;
//}

//문제41000000 이하의 피보나치수열(N번째항이N- 1번째항과N- 2번째항으로표현되는수열, 시작은1, 1, 2, 3, 5, 8, ...) 의 짝수 항들의 합을 구한다
//int main() {
//	int a = 1, b = 1 , c, sum=0 ;
//	while (b <= 1000000) {
//		if (b % 2 == 0) {
//			sum += b;
//		}
//		
//		c = a + b;
//		a = b;
//		b = c;
//	}
//
//	printf("짝수항의 합: %d", sum);
//	return 0;
//}

//문제5 사용자로 부터 n값을 입력받고 1부터 n까지의 곱을 출력
//int main() {
//	int n;
//	int i=1;
//	int x=1;
//
//	printf("n을 입력하세요.");
//	scanf("%d", &n);
//	
//	while (i <= n) {
//		x = x * i;
//		i++;
//	}
//	printf("1부터 %d까지의 곱의합 : %d",n,x);
//}

//문제6 i)a+b+c=2000 ii)a>b>c abc는 모두자연수 다음식을 만족하는 abc갯수 구하기
//int main(){
//	int count=0;
//	for (int c = 1; c < 2000; c++) {
//		for (int b = c + 1;b <2000; b++) {
//			int a = 2000 - b - c;
//			if (a > b) {
//				count++;
//			}
//		}
//	}
//	printf("경우의수 : %d", count);
//}

//문제7 임의의자연수N을 입력받아 N을소인수분해한 결과를 출력하여라. 예를들어서N = 18일경우 ,N = 18 = 2 * 3 * 3
//int main() {
//	int n;
//	printf("자연수n을 입력하세요.");
//	scanf("%d", &n);
//
//	printf("n = %d =", n);
//
//	for (int i = 2; i <= n;i++) {
//		while (n % i ==0) {
//			n = n / i;
//			if (n ==1) {
//				printf(" %d", i);
//			}
//			else
//			{
//				printf(" %d *", i);
//			}
//		}
//	}
//	printf("\n");
//}
