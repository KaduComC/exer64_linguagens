continuar = True

while continuar == True:
    valor = int(input('Numero: '))
    if valor % 2 == 0:
        print('Valor é par')
        if valor >= 0:
            print('Valor é positivo')
        elif valor < 0:
            print('Valor é negativo')
    elif valor % 2 == 1:
        print('Valor é impar')
        if valor >= 0:
            print('Valor é positivo')
        elif valor < 0:
            print('Valor é negativo')
        
    opc = str(input('\nS - s / N - n\nParar? '))
    if opc == 'S' or opc == 's':
        continuar = False

# Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, 
# e  se  é  positivo  ou  negativo.  O  programa  só  deve  parar  de  
# rodar  quando  o  usuário  responder  "S"  na  seguinte 
# pergunta, "Deseja encerrar o programa?" 