//#include <stdio.h>
//
//int main() {
//	/*int arr[3][3] = { 1,2,3,4,5,6,7,8,9 };
//
//	printf("arr배열의 2행 3열의 수를 출력 : %d\n", arr[1][2]);
//	printf("arr배열의 3행 3열의 수를 출력 : %d\n", arr[2][2]);*/
//
//	int score[3][2];
//	int i, j;
//	for (i = 0; i < 3;i++) {
//		for (j = 0; j < 2;j++) {
//			if (j == 0) {
//				printf("%d 번째 학생의 국어점수 : ", i + 1);
//				scanf("%d", &score[i][j]);
//			}
//			else if (j == 1) {
//				printf("%d 번째 학생의 수학점수 : ", i + 1);
//				scanf("%d", &score[i][j]);
//			}
//		}
//	}
//
//	for (i = 0; i < 3;i++) {
//		printf("%d 번째 학생의 국어성적은 : %d , 수학성적: %d\n", i + 1, score[i][0], score[i][1]);
//	}
//}