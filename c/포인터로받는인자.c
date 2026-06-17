#include <stdio.h>

int change_val(int i) {
	i = 3;
	return 0;
}

int main() {
	int i = 0;
	printf("호출 이전의 i값 : %d", i);
	change_val(i);
	printf("호출 이후의 i값 :%d", i);
}