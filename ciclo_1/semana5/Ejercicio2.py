# libreria pandas - leer archivos csv

import pandas as pd

ruta = r'C:\Users\israelarbonaguerrero\Desktop\RUTA2_MISIONTIC_2022\grupo_48\ciclo_1\semana5\archivo.csv'

datosDataFrame = pd.read_csv(ruta, sep=';')
print(datosDataFrame)
print()

datosDataFrame = pd.read_csv(ruta, sep=';', header=None)
print(datosDataFrame)
print()

datosDataFrame = pd.read_csv(ruta, sep=';', skiprows=1)
print(datosDataFrame)
print()

datosDataFrame = pd.read_csv(ruta, sep=';', skiprows=1,
                            names=['Id','Pr Nombre','Sg Nombre','Edad','Salario 1','Salario 2'])
print(datosDataFrame)
print()

datosDataFrame = pd.read_csv(ruta, sep=';', skiprows=1,
                            names=['Id','Pr Nombre','Sg Nombre','Edad','Salario 1','Salario 2'],
                            na_values='?')
print(datosDataFrame)
print()

datosDataFrame = pd.read_csv(ruta, sep=';', skiprows=1,
                            names=['Id','Pr Nombre','Sg Nombre','Edad','Salario 1','Salario 2'],
                            na_values='?',
                            index_col=['Pr Nombre','Sg Nombre'])
print(datosDataFrame)
print()
