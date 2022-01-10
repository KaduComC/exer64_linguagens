idade = int(input('Idade: '))

if idade == 5 and idade <= 7:
    print('Infantil A = 5 a 7 anos ')
elif idade > 7 and idade <= 11:
    print('Infantil B = 8 a 11 anos ')
elif idade > 11 and idade <= 13:
    print('Juvenil A = 12 a 13 anos ')
elif idade > 13 and idade <= 17:
    print('Juvenil B = 14 a 17 anos ')
elif idade > 17:
    print('Adultos = Maiores de 18 anos ')

