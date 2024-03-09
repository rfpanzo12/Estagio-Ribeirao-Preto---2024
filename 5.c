#include <stdio.h>

int main()
{
    char string[20]; //Tamanho máximo da string: 20 carateres
    char x;
    int tamanho_str = 0, i, j;
    
    printf("Informe a String: ");
    scanf("%s", string);  //Leitura da string
    
    for(i=0; string[i] != '\0'; i++) tamanho_str++;  //Calcula o tamanho da string
    
    for(i=0; i < tamanho_str; i++){        //Efetua a troca dos carateres até a ordem reversa
        for(j=0; j<tamanho_str-i-1; j++){
            x = string[j+1];
            string[j+1] = string[j];
            string[j] = x;
        }
    }
    
    printf("String na ordem reversa: ");
    for(i=0; i < tamanho_str; i++) printf("%c", string[i]);  //Imprime na tela a string na ordem reversa
    printf("\n");
    
    return 0;
}

