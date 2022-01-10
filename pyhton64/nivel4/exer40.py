continuar = True

while continuar == True:
    indice = float(input('Informe o indice de poluição: '))

    if indice <= 0.25:
        print('Aceitavel')
    elif indice > 0.25 and indice <=0.3:
        print('Indústrias do 1º  grupo devem suspender suas atividades')
    elif indice > 0.3 and indice <=0.4:
        print('Industrias do 1º  e 2º  grupo devem suspender suas atividades')
    elif indice > 0.4:
        print('Todos os grupos devem suspender suas atividades')

    opc = input('S - s / N - n\nDeseja continuar? ')
    if opc == 'N' or opc == 'n':
        continuar = False
# A  Secretaria  de  Meio  Ambiente  que  controla  o  índice  de  poluição  
# mantém  03  grupos  de  indústrias  que  são 
# altamente  poluentes  do  meio  ambiente.  O  índice  de  poluição  aceitável  
# varia  de  0,05  até  0,25.  Se  o  índice  sobe 
# para 0,3 as indústrias do 1º  grupo são intimadas a suspenderem suas atividades, 
# se o índice crescer para 0,4 as 
# industrias do 1º  e 2º  grupo  são intimadas a suspenderem suas atividades, 
# se o índice atingir 0,5 todos os grupos 
# devem  ser  notificados  a  paralisarem  suas  atividades.  
# Faça  um  programa  que  leia  o  índice  de  poluição  medido  e 
# emita  a  notificação  adequada  aos  diferentes  grupos  de  empresas.  
# O  algoritmo  só  deve  parar  de  rodar  quando  o 
# usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?"