valor = int(input('Informe um valor: '))
soma = 0
if valor > 0 and valor < 10:
    for i in range(valor, 40+valor):
        if i % 2 == 1:
            soma += (2 ** i)
    print(f'Soma dos impares positivos = {soma}')
else:
    print('Valor deve ser maior que 0 e menor que 10')

# Escreva  um  programa  que  calcule  e  exiba  a  soma  dos  quadrados  dos  20
#   primeiros  números  inteiros  positivos 
# ímpares a partir do número informado pelo usuário menor que 10 e maior que zero