# función all y any

'''
print('Respuestas de all')
print(all([True, True, True]))
print(all([True,False,True]))
print(all([False, False, False]))
print(all([]))

print('Respues de any')
print(any([True, True, True]))
print(any([True, False, True]))
print(any([False, False, False]))
print(any([]))
'''

info = [int(input()),input().split(' ')]
print(info)

print('True' 
if all(list(map(lambda x: x>0,list(map(int,info[1] )) )) )
and
any(list(map(lambda x:x[0] == x[1] or x[0] == '5', list(zip(info[1],
list(map(lambda x : x[-1:(len(x)+1)*-1:-1],info[1] )) )) )) )
else 'False'
)

resultado1 = all(list(map(lambda x: x>0, list(map(int,info[1] )) )) )
# print(resultado1)
resultado2 = list(map(int,info[1]))
# print(resultado2)

resultado2 = list( zip(info[1], list(map(lambda x : x[-1:(len(x)+1) * -1 :-1],info[1] )) ))
print(resultado2)
