def main():
    valor1 = int(input('Valor 1: '))
    valor2 = int(input('Valor 2: '))
    opcao = int(input("Opção de calculo: \n1 - Verificar se um dos números lidos é ou não múltiplo do outro" +
        "\n2 – Verificar se os dois números lidos são pares" + 
        "\n3 – Verificar se a média dos dois números é maior ou igual a 7" + 
        "\n4 – Sair\nEscolha: "))
    
    if opcao == 1:
        multiplos(valor1, valor2)
    elif opcao == 2:
        pares(valor1, valor2)
    elif opcao == 3:
        media(valor1, valor2)
    elif opcao == 4:
        print('Saindo')
    else:
        print('Opção errada')
    
def multiplos(valor1, valor2):
    if valor1 % valor2 == 0: print(f'{valor1} é multiplo de {valor2}')
    if valor2 % valor1 == 0: print(f'{valor2} é multiplo de {valor1}')
    else:
        print('Não são multiplos')

def pares(valor1, valor2):
    if valor1 % 2 == 0: print(f'{valor1} é par')
    if valor2 % 2 == 0: print(f'{valor2} é par')
    else: 
        print(f'{valor1} e {valor2} não são pares')

def media(valor1, valor2):
    media = (valor1 + valor2) / 2
    if media >= 7:
        print(f'A média {media} é maior ou igual a 7')
    else:
        print(f'A média {media} é menor que 7')

if __name__ == '__main__':
    main()