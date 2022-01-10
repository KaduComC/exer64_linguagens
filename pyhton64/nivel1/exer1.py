quantidade_minima = input("MAX: ")
quantidade_minima = int(quantidade_minima)

quantidade_maxima = input("MIN: ")
quantidade_maxima = int(quantidade_maxima)

estoque_medio = float((quantidade_minima + quantidade_maxima) / 2)
print(f'Estoque médio é de {estoque_medio}')
