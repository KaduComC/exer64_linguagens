idade_ano = int(input('IDade em anos: '))
idade_mes = int(input('Idade em meses: '))
idade_dia = int(input('Idade em dias: '))

idade = (idade_ano * 365) + (idade_mes * 30) + idade_dia
print(f'Idade: {idade}')