cotacao_dolar = input('Cotação do dolar: ')
cotacao_dolar = float(cotacao_dolar)

valor_dolar = input('Valor em dolares: ')
valor_dolar = float(valor_dolar)

conversao_real = float(valor_dolar * cotacao_dolar)
print(f'Conversão: {conversao_real}')