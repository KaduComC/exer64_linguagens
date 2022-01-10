tempo_viagem = int(input('Tempo de viagem: '))
velocidade_viagem = int(input('Velocidade: '))
distancia = tempo_viagem * velocidade_viagem
litros_usados = distancia / 12
print(f'Litros usados: {litros_usados}')
