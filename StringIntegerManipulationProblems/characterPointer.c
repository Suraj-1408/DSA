#include<stdio.h>
#include<stdlib.h>

//Note- *str -> points to memory address of character or string,where str stores the address and using *str i.e value(at Address), we get the character at that address.

void printCharacter(char* str){
	
	while(*str != '\0'){
		
		printf("%c",*str);		//print single charcter pointing by *str.
		str = str + 1;
	}
}


int main(){
	//char *str;
	//allocating memory to str dynamically.
	char *str = (char*)malloc(sizeof(char));

	printf("Name:");
	scanf("%s",str);
	//printf("String is:%s\n",str);

	longSubstringLength(str);

	return 0;
}
