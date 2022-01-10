id_vendedor = str(input('ID do vendedor: '))
codigo_peca = str(input('Código da peça: '))
preco_unitario = float(input('Preço unitario: '))
quantidade_vendida = int(input('Quantidade vendida: '))

pagamento = float(0.05 * (preco_unitario * quantidade_vendida))
print(f'Id: {id_vendedor}\n' + 
    f'Código da peça: {codigo_peca}\n' + 
    f'Preço unitario: {preco_unitario}\n' + 
    f'Quantidade vendida: {quantidade_vendida}\n' + 
    f'Pagamento: {round(pagamento, 2)}')






