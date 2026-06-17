//#include <stdio.h>
//
//int main() {
//	/*int arr[10] = {20,60,52,901,20,81,61,27,99,100};
//	int i;
//	for (i = 0; i < 10; i++) {
//		printf("배열의 %d번째 원소 = %d\n", i+1, arr[i]);
//	}*/
//
//	//배열로 소수 찾는 프로그램
//	//int guess = 5; //소수의 배열
//	//int prime[1000];
//	//int index = 1;
//	//int i;
//	//int ok;
//	//prime[0] = 2;
//	//prime[1] = 3;
//	//for (;;) {
//	//	ok = 0;
//	//	for (i = 0; i <= index; i++) {
//	//		if (guess % prime[i] != 0) {
//	//			ok++;
//	//		}
//	//		else {
//	//			break;
//	//		}
//	//	}
//	//	if (ok == (index + 1)) {
//	//		index++;
//	//		prime[index] = guess;
//	//		printf("소수 : %d \n", prime[index]);
//	//		if (index == 999)break;
//	//	}
//	//	guess += 2;
//	//}
//
//	//입력받는 학생들의 성적을 높은 순으로 정렬하는 프로그램
//	//1. 학생수 - 변수로만
//	//2. 각 학생들의 성적 - 변수 배열로
//	//3. 성적 산출 - for문 if 문
//
//	int class;
//	int score[100];
//	int c;
//
//	printf("학생의 수 : ");
//	scanf("%d", &class);
//	if (class > 30) {
//		printf("다시 작성하시오.");
//		return 0;
//	}
//	
//	for (int i=0;i < class;i++) {
//		printf("학생들의 점수:");
//		scanf("%d", &score[i]);
//		if(score[i] > 100) {
//			printf("최대 점수는 100점입니다.\n");
//			i--;
//		}
//		
//	}
//
//	for (int i =0;i < class;i++) {
//		for (int j=0;j < class-1;j++) {
//			if (score[j] < score[j+1]) {
//				c = score[j];
//				score[j] = score[j + 1];
//				score[j + 1] = c;
//			}
//		}
//	}
//	for (int i =0;i < class;i++) {
//		printf("%d등의 점수는 :%d \n", i+1, score[i]);
//	}
//	return 0;
//}